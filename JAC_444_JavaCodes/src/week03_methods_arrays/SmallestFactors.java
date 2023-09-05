package week03_methods_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//Q1
public class SmallestFactors {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Display all the number's smallest factors in decreasing order
        System.out.print("The smallest factors of " + number + " are: ");
        ArrayList<Integer> factors = getSmallestFactors(number);
        Collections.sort(factors, Collections.reverseOrder()); // Sort factors in decreasing order

        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> getSmallestFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }

        return factors;
    }
}
