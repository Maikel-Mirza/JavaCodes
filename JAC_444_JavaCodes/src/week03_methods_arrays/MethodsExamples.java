package week03_methods_arrays;

import java.util.Scanner;

public class MethodsExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter to integer numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        max(num1, num2);
        separator();
        int maxNum = maxInt(num1, num2);
        System.out.println("max number is: " + maxNum);
        System.out.println("max number is: " + maxInt(num1, num2));

        printChar('A');
        printChar('Y');
        printSeq(maxNum);
    }

    static void max(int x1, int x2) {
        if (x1 > x2) {
            System.out.println(x1 + " is larger than " + x2);
        } else if (x2 > x1)
            System.out.println(x2 + " is larger than " + x1);
        else
            System.out.println(x1 + " is equal to " + x2);
    }

    static int maxInt(int x1, int x2) {
        if (x1 >= x2) {
            return x1;
        } else
            return x2;
    }

    static void separator() {
        System.out.println("************************");
    }

    static void printChar(char x) {
        for (int i = 0; i < 5; i++) {
            System.out.print(x + " ");
        }
    }

    static void printSeq(int maxNum) {
        for (int i = 1; i <= maxNum; i++) {
            System.out.print(i + " ");
        }
    }
}
