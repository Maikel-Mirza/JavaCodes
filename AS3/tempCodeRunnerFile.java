import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyVirtualKeyboard {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            MyVirtualKeyboardPanel keyboardPanel = new MyVirtualKeyboardPanel();
            frame.add(keyboardPanel);

            frame.pack();
            frame.setVisible(true);
        });
    }
}

class MyVirtualKeyboardPanel extends JPanel {
    private JTextArea textArea;

    public MyVirtualKeyboardPanel() {
        setLayout(new BorderLayout());

        textArea = new JTextArea(5, 30);
        textArea.setEditable(false);
        textArea.setLineWrap(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel descriptionPanel = createDescriptionPanel();
        add(descriptionPanel, BorderLayout.NORTH);

        add(createKeyboardPanel(), BorderLayout.SOUTH);

        setFocusable(true);
        requestFocusInWindow();
    }

    private JPanel createDescriptionPanel() {
        JPanel descriptionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel descriptionLabel = new JLabel("<html><b>Type some text using your keyboard. The keys you press will be highlighted and the text will be displayed.<br>Note: Clicking the buttons with your mouse will not perform any action.</b></html>");
        descriptionPanel.add(descriptionLabel);
        return descriptionPanel;
    }

    private JPanel createKeyboardPanel() {
        JPanel keyboardPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        String[][] keyLabels = {
            {"~", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "+", "Backspace"},
            {"Tab", "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", "\\"},
            {"Caps", "A", "S", "D", "F", "G", "H", "J", "K", "L", ":", "\"", "Enter"},
            {"Shift", "Z", "X", "C", "V", "B", "N", "M", ",", ".", "?", "^"},
            {" ", "\u2191", " ", "\u2190", "\u2192"} // Space bar and arrow keys
        };

        // Add keys
        for (int row = 0; row < keyLabels.length; row++) {
            for (int col = 0; col < keyLabels[row].length; col++) {
                String keyLabel = keyLabels[row][col];
                JButton keyButton = new JButton(keyLabel);
                keyButton.setFocusPainted(false);
                keyButton.addActionListener(new KeyButtonListener());

                gbc.gridx = col;
                gbc.gridy = row;

                // Special treatment for the space key and arrow keys
                if (keyLabel.equals(" ")) {
                    gbc.gridwidth = 3; // Span 3 columns for space
                    gbc.weightx = 1.0; // Occupy extra space
                    gbc.fill = GridBagConstraints.HORIZONTAL;
                    keyButton.setPreferredSize(new Dimension(40, 40)); // Adjust size
                } else if (keyLabel.equals("\u2191") || keyLabel.equals("\u2190") || keyLabel.equals("\u2192")) {
                    gbc.gridwidth = 1; // Regular size for arrow keys
                    gbc.weightx = 0.0;
                    gbc.fill = GridBagConstraints.NONE;
                    keyButton.setPreferredSize(new Dimension(30, 40)); // Adjust size
                } else {
                    gbc.gridwidth = 1; // Regular keys
                    gbc.weightx = 0.0;
                    gbc.fill = GridBagConstraints.NONE;
                    keyButton.setPreferredSize(new Dimension(35, 40)); // Adjust size
                }

                keyboardPanel.add(keyButton, gbc);
            }
        }

        return keyboardPanel;
    }

    private class KeyButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton keyButton = (JButton) e.getSource();
            String keyLabel = keyButton.getText();
            textArea.append(keyLabel);
        }
    }
}
