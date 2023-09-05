package week02_elementary_programming;

import java.util.Scanner;

public class MultiwayIfExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your grade(0-100): ");
		double grade = input.nextDouble();
		
		
		if (grade >= 90) {
			System.out.println("A+");
		} else if (grade >= 80) {
			System.out.println("A");
		} else if (grade >= 75) {
			System.out.println("B+");
		} else {
			System.out.println("Unknown grade: " + grade);
		}
	}
}
