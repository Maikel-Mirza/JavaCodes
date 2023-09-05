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
        setSize(400, 250); // Adjusted frame height

        // Create and initialize components
        rollButton = new JButton("Roll Dice");
        rollButton.addActionListener(this);
        rollButton.setPreferredSize(new Dimension(100, 30)); // Set button size

        dicePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int diceSize = 80;
                int padding = 20;

                int x1 = (getWidth() - 2 * (diceSize + padding)) / 3; // Calculate x position for the first dice
                int x2 = 2 * x1 + diceSize + padding; // Calculate x position for the second dice
                int y = (getHeight() - diceSize) / 2; // Center vertically

                g.setColor(Color.gray); // Set dice color

                g.fillRoundRect(x1, y, diceSize, diceSize, 10, 10); // Draw the first dice
                g.fillRoundRect(x2, y, diceSize, diceSize, 10, 10); // Draw the second dice

                // Set dot color
                g.setColor(Color.white);

                drawDots(g, rollValue1, x1, y, diceSize, padding);
                drawDots(g, rollValue2, x2, y, diceSize, padding);
            }
        };

        // Initialize roll values with random numbers
        rollDice();

        // Create a panel for the button and position it in the middle bottom
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(rollButton);

        // Add components to the frame
        setLayout(new BorderLayout());
        add(dicePanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void drawDots(Graphics g, int rollValue, int x, int y, int diceSize, int padding) {
        int dotSize = 10;

        switch (rollValue) {
            case 1:
                drawDot(g, x + diceSize / 2, y + diceSize / 2, dotSize);
                break;
            case 2:
                drawDot(g, x + diceSize / 4, y + diceSize / 4, dotSize);
                drawDot(g, x + 3 * diceSize / 4, y + 3 * diceSize / 4, dotSize);
                break;
            case 3:
                drawDot(g, x + diceSize / 4, y + diceSize / 4, dotSize);
                drawDot(g, x + diceSize / 2, y + diceSize / 2, dotSize);
                drawDot(g, x + 3 * diceSize / 4, y + 3 * diceSize / 4, dotSize);
                break;
            case 4:
                drawDot(g, x + diceSize / 4, y + diceSize / 4, dotSize);
                drawDot(g, x + 3 * diceSize / 4, y + diceSize / 4, dotSize);
                drawDot(g, x + diceSize / 4, y + 3 * diceSize / 4, dotSize);
                drawDot(g, x + 3 * diceSize / 4, y + 3 * diceSize / 4, dotSize);
                break;
            case 5:
                drawDot(g, x + diceSize / 4, y + diceSize / 4, dotSize);
                drawDot(g, x + 3 * diceSize / 4, y + diceSize / 4, dotSize);
                drawDot(g, x + diceSize / 2, y + diceSize / 2, dotSize);
                drawDot(g, x + diceSize / 4, y + 3 * diceSize / 4, dotSize);
                drawDot(g, x + 3 * diceSize / 4, y + 3 * diceSize / 4, dotSize);
                break;
            case 6:
                drawDot(g, x + diceSize / 4, y + diceSize / 4, dotSize);
                drawDot(g, x + 3 * diceSize / 4, y + diceSize / 4, dotSize);
                drawDot(g, x + diceSize / 4, y + diceSize / 2, dotSize);
                drawDot(g, x + 3 * diceSize / 4, y + diceSize / 2, dotSize);
                drawDot(g, x + diceSize / 4, y + 3 * diceSize / 4, dotSize);
                drawDot(g, x + 3 * diceSize / 4, y + 3 * diceSize / 4, dotSize);
                break;
            default:
                break;
        }
    }

    private void drawDot(Graphics g, int x, int y, int size) {
        g.fillOval(x - size / 2, y - size / 2, size, size);
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
