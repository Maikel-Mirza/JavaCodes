package week02_elementary_programming;

import java.util.Scanner;

public class IterationExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Please enter a positive number (to stop enter 0):");
		int number1 = input.nextInt();
		
		while (number1 > 0) {
			System.out.print("Please enter a positive number (to stop enter 0):");
			number1 = input.nextInt();
		}

		System.out.println("***************************");

		int number2;
		do {
			System.out.print("Please enter a positive number (to stop enter 0):");
			number2 = input.nextInt();
		} while (number2 > 0);

	}

}
