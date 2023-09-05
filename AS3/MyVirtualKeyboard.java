import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
            {" ", "\u2190", "\u2191", "\u2193", "\u2192"} // Space bar, left, up, down, right keys
        };

        // Add keys
        for (int row = 0; row < keyLabels.length; row++) {
            for (int col = 0; col < keyLabels[row].length; col++) {
                String keyLabel = keyLabels[row][col];
                JButton keyButton = new JButton(keyLabel);
                keyButton.setFocusPainted(false);
                keyButton.addActionListener(new KeyButtonListener());
                keyButton.addMouseListener(new KeyButtonMouseListener());

                // Special treatment for the space key
                if (keyLabel.equals(" ")) {
                    gbc.gridwidth = 2; // Span two columns for space
                    gbc.weightx = 1.0; // Occupy extra space
                    gbc.fill = GridBagConstraints.HORIZONTAL; // Expand horizontally
                    keyButton.setPreferredSize(new Dimension(55, 40)); // Adjust size
                } else {
                    gbc.gridwidth = 1; // Reset grid width for regular keys
                    gbc.weightx = 0.0; // Reset weight for regular keys
                    gbc.fill = GridBagConstraints.NONE; // Reset fill for regular keys
                }

                gbc.gridx = col;
                gbc.gridy = row;
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

    private class KeyButtonMouseListener extends MouseAdapter {
        @Override
        public void mouseEntered(MouseEvent e) {
            JButton keyButton = (JButton) e.getSource();
            keyButton.setBackground(Color.GREEN);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JButton keyButton = (JButton) e.getSource();
            keyButton.setBackground(null);
        }
    }
}
