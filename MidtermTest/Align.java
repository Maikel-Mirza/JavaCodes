import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Align {
    private static boolean snapToGridEnabled = false;
    private static boolean showGridEnabled = false;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Align");

        // Create subpanels with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel panel1 = new JPanel(new FlowLayout());
        JPanel panel2 = new JPanel(new GridLayout(2, 1));
        JPanel panel3 = new JPanel(new FlowLayout());

        // Create components
        JLabel labelX = new JLabel("X Coordinate");
        JTextField textFieldX = new JTextField(10);

        JLabel labelY = new JLabel("Y Coordinate");
        JTextField textFieldY = new JTextField(10);

        JCheckBox snapToGridCheckbox = new JCheckBox("Snap to Grid");
        JCheckBox showGridCheckbox = new JCheckBox("Show Grid");

        JButton buttonOk = new JButton("OK");
        JButton buttonCancel = new JButton("Cancel");
        JButton buttonHelp = new JButton("Help");

        // Add components to subpanels
        panel1.add(labelX);
        panel1.add(textFieldX);

        panel2.add(labelY);
        panel2.add(textFieldY);

        panel3.add(snapToGridCheckbox);
        panel3.add(showGridCheckbox);
        panel3.add(buttonOk);
        panel3.add(buttonCancel);
        panel3.add(buttonHelp);

        // Add subpanels to the main panel with BorderLayout
        mainPanel.add(panel1, BorderLayout.NORTH);
        mainPanel.add(panel2, BorderLayout.CENTER);
        mainPanel.add(panel3, BorderLayout.SOUTH);

        // Add the main panel to the frame
        frame.getContentPane().add(mainPanel);

        // Add action listeners to buttons
        buttonOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("OK button clicked");
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cancel button clicked");
            }
        });

        buttonHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Help button clicked");
            }
        });

        // Add action listener to snap to grid checkbox
        snapToGridCheckbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                snapToGridEnabled = snapToGridCheckbox.isSelected();
                System.out.println("Snap to Grid: " + snapToGridEnabled);
            }
        });

        // Add action listener to show grid checkbox
        showGridCheckbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showGridEnabled = showGridCheckbox.isSelected();
                System.out.println("Show Grid: " + showGridEnabled);
                mainPanel.repaint();
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    static class Grid extends JPanel {
        private final int gridSize = 10;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (showGridEnabled) {
                g.setColor(Color.LIGHT_GRAY);
                for (int x = 0; x < getWidth(); x += gridSize) {
                    g.drawLine(x, 0, x, getHeight());
                }
                for (int y = 0; y < getHeight(); y += gridSize) {
                    g.drawLine(0, y, getWidth(), y);
                }
            }
        }
    }
}
