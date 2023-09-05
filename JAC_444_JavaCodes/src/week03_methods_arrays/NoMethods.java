package week03_methods_arrays;

import java.util.Scanner;

public class NoMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter to integer numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

//        if (num1 > num2) {
//            System.out.println(num1 + " is larger than " + num2);
//        } else if (num2 > num1)
//            System.out.println(num2 + " is larger than " + num1);
//        else
//            System.out.println(num1 + " is equal to " + num2);
        max(num1, num2);

        num1 = 1567478854;
        num2 = 45477;

//        if (num1 > num2) {
//            System.out.println(num1 + " is larger than " + num2);
//        } else if (num2 > num1)
//            System.out.println(num2 + " is larger than " + num1);
//        else
//            System.out.println(num1 + " is equal to " + num2);
        max(num1, num2);

        num1 = 10;
        num2 = 10;
        max(num1, num2);
    }

    static void max(int x1, int x2) {
        if (x1 > x2) {
            System.out.println(x1 + " is larger than " + x2);
        } else if (x2 > x1)
            System.out.println(x2 + " is larger than " + x1);
        else
            System.out.println(x1 + " is equal to " + x2);
    }
}
