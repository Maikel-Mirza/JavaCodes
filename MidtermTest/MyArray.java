import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        int[] counts = new int[1001]; // Array to store the occurrences of each number

        // Read integers from the user until 0 is entered
        System.out.print("Enter the integers between 1 and 1000: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num != 0) {
            counts[num]++; // Increment the count for the entered number
            num = scanner.nextInt();
        }

        // Display the occurrences of each number
        for (int i = 1; i <= 1000; i++) {
            if (counts[i] > 0) {
                String times = (counts[i] > 1) ? "times" : "time";
                System.out.println(i + " occurs " + counts[i] + " " + times);
            }
        }
        
        scanner.close(); // Close the Scanner
    }
}
