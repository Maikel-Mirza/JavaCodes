package week03_methods_arrays;
//Q3
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Prompt the user to enter an integer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        int remainder;

        // Reverse the number
        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        // Check if the original number and the reversed number are equal
        return originalNumber == reversedNumber;
    }
}