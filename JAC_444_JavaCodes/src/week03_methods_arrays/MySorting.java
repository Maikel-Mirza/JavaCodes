package week03_methods_arrays;

//q2
import java.util.Scanner;

public class MySorting {
    public static void main(String[] args) {
        // Prompt the user to enter three numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
        scanner.close();

        // Invoke the displaySortedNumbers method to display the numbers in increasing order
        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        // Sort the numbers in increasing order
        double temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Display the numbers in increasing order
        System.out.println("Numbers in increasing order: " + num1 + ", " + num2 + ", " + num3);
    }
}
