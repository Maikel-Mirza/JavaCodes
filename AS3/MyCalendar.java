import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MyCalendar {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("My Calendar");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            CalendarPanel calendarPanel = new CalendarPanel();
            frame.add(calendarPanel);

            frame.pack();
            frame.setVisible(true);
        });
    }
}

class CalendarPanel extends JPanel {
    private final SimpleDateFormat monthYearFormat = new SimpleDateFormat("MMMM, yyyy", Locale.ENGLISH);
    private final Calendar calendar = Calendar.getInstance();

    private JLabel monthLabel;
    private JPanel daysPanel;

    public CalendarPanel() {
        setLayout(new BorderLayout());

        monthLabel = new JLabel(monthYearFormat.format(calendar.getTime()), SwingConstants.CENTER);
        monthLabel.setFont(monthLabel.getFont().deriveFont(Font.ITALIC | Font.BOLD, 16f));

        daysPanel = new JPanel(new GridLayout(0, 7));

        JButton priorButton = new JButton("Prior");
        JButton nextButton = new JButton("Next");

        priorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calendar.add(Calendar.MONTH, -1);
                updateCalendar();
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calendar.add(Calendar.MONTH, 1);
                updateCalendar();
            }
        });

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(monthLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(priorButton);
        buttonPanel.add(nextButton);

        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.add(topPanel, BorderLayout.CENTER);

        String[] dayNames = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        JPanel dayNamesPanel = new JPanel(new GridLayout(1, 7));
        for (String day : dayNames) {
            dayNamesPanel.add(new JLabel(day, SwingConstants.CENTER));
        }

        JPanel calendarPanel = new JPanel(new BorderLayout());
        calendarPanel.add(dayNamesPanel, BorderLayout.NORTH);
        calendarPanel.add(daysPanel, BorderLayout.CENTER);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(calendarPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel, BorderLayout.CENTER);

        updateCalendar();
    }

    private void updateCalendar() {
        daysPanel.removeAll();

        // Get the first day of the month
        Calendar monthStart = Calendar.getInstance();
        monthStart.setTime(calendar.getTime());
        monthStart.set(Calendar.DAY_OF_MONTH, 1);

        // Determine the start day of the week for the current month
        int firstDayOfWeek = monthStart.get(Calendar.DAY_OF_WEEK);

        // Determine the last day of the previous month
        Calendar prevMonthLastDay = (Calendar) monthStart.clone();
        prevMonthLastDay.add(Calendar.DAY_OF_MONTH, -firstDayOfWeek + 1);

        // Determine the last day of the current month
        Calendar nextMonthFirstDay = (Calendar) monthStart.clone();
        nextMonthFirstDay.add(Calendar.MONTH, 1);
        int lastDayOfCurrentMonth = nextMonthFirstDay.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Print dates from the previous month
        for (int i = prevMonthLastDay.get(Calendar.DAY_OF_MONTH); i <= prevMonthLastDay.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            JLabel dayLabel = new JLabel(Integer.toString(i), SwingConstants.CENTER);
            dayLabel.setForeground(Color.GRAY);
            daysPanel.add(dayLabel);
        }

        // Print the days of the current month
        int currentMonth = calendar.get(Calendar.MONTH);
        Calendar currentDay = (Calendar) monthStart.clone();
        while (currentDay.get(Calendar.MONTH) == currentMonth) {
            int day = currentDay.get(Calendar.DAY_OF_MONTH);
            JLabel dayLabel = new JLabel(Integer.toString(day), SwingConstants.CENTER);
            if (currentDay.get(Calendar.MONTH) == currentMonth) {
                dayLabel.setForeground(Color.BLACK);
                dayLabel.setFont(dayLabel.getFont().deriveFont(Font.BOLD));
            } else {
                dayLabel.setForeground(Color.GRAY);
            }
            daysPanel.add(dayLabel);

            currentDay.add(Calendar.DAY_OF_MONTH, 1);
        }

        // Print dates from the following month
        for (int i = 1; i <= 42 - (lastDayOfCurrentMonth + firstDayOfWeek - 1); i++) {
            JLabel dayLabel = new JLabel(Integer.toString(i), SwingConstants.CENTER);
            dayLabel.setForeground(Color.GRAY);
            daysPanel.add(dayLabel);
        }

        // Reset the calendar
        calendar.setTime(monthStart.getTime());
        monthLabel.setText(monthYearFormat.format(calendar.getTime()));
        daysPanel.revalidate();
        daysPanel.repaint();
    }
}
