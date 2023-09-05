import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomDice extends JFrame implements ActionListener {
    private JButton rollButton;
    private JPanel dicePanel;

    private int rollValue1;
    private int rollValue2;

    public RandomDice() {
        setTitle("Random Dice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        // Create and initialize components
        rollButton = new JButton("Roll Dice");
        rollButton.addActionListener(this);

        dicePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawDice(g, rollValue1, getWidth() / 4, getHeight() / 2);
                drawDice(g, rollValue2, 3 * getWidth() / 4, getHeight() / 2);
            }
        };

        // Initialize roll values with random numbers
        rollDice();

        // Add components to the frame
        setLayout(new BorderLayout());
        add(rollButton, BorderLayout.SOUTH);
        add(dicePanel, BorderLayout.CENTER);
    }

    private void drawDice(Graphics g, int rollValue, int x, int y) {
        int diceSize = 80;
        int padding = 20;

        g.setColor(Color.white);
        g.fillRect(x, y, diceSize, diceSize);
        g.setColor(Color.black);
        g.drawRect(x, y, diceSize, diceSize);

        int dotSize = 10;
        int midX = x + diceSize / 2;
        int midY = y + diceSize / 2;

        // Draw dots based on the roll value
        switch (rollValue) {
            case 1:
                drawDot(g, midX, midY, dotSize);
                break;
            case 2:
                drawDot(g, midX - padding, midY - padding, dotSize);
                drawDot(g, midX + padding, midY + padding, dotSize);
                break;
            case 3:
                drawDot(g, midX - padding, midY - padding, dotSize);
                drawDot(g, midX, midY, dotSize);
                drawDot(g, midX + padding, midY + padding, dotSize);
                break;
            case 4:
                drawDot(g, midX - padding, midY - padding, dotSize);
                drawDot(g, midX + padding, midY - padding, dotSize);
                drawDot(g, midX - padding, midY + padding, dotSize);
                drawDot(g, midX + padding, midY + padding, dotSize);
                break;
            case 5:
                drawDot(g, midX - padding, midY - padding, dotSize);
                drawDot(g, midX + padding, midY - padding, dotSize);
                drawDot(g, midX, midY, dotSize);
                drawDot(g, midX - padding, midY + padding, dotSize);
                drawDot(g, midX + padding, midY + padding, dotSize);
                break;
            case 6:
                drawDot(g, midX - padding, midY - padding, dotSize);
                drawDot(g, midX + padding, midY - padding, dotSize);
                drawDot(g, midX - padding, midY, dotSize);
                drawDot(g, midX + padding, midY, dotSize);
                drawDot(g, midX - padding, midY + padding, dotSize);
                drawDot(g, midX + padding, midY + padding, dotSize);
                break;
            default:
                break;
        }
    }

    private void drawDot(Graphics g, int x, int y, int size) {
        g.fillOval(x, y, size, size);
    }

    private void rollDice() {
        Random random = new Random();
        rollValue1 = random.nextInt(6) + 1; // Generates a random number between 1 and 6 for the first die
        rollValue2 = random.nextInt(6) + 1; // Generates a random number between 1 and 6 for the second die
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rollButton) {
            rollDice(); // Roll both dice
            dicePanel.repaint(); // Redraw the dice panel
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RandomDice diceApp = new RandomDice();
            diceApp.setVisible(true);
        });
    }
}
