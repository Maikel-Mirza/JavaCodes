package week02_elementary_programming;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the error code: ");
		int errorCode = input.nextInt();
		
		switch (errorCode) {
		case 0:
			System.out.println("Error: FileNotFoundException");
			break;
		case 1:
			System.out.println("Error: ClassNotFoundException");
			break;
		case 2:
			System.out.println("Error: Something");
			break;

		default:
			System.out.println("Unknown Error");
		}
	}

}
