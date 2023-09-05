package week03_methods_arrays;

import java.util.Scanner;

public class MethodsExamplesMore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter the radius as a double: ");
            double radius = input.nextDouble();
            calculateArea(radius);
            double area = calculateAreaWithReturn(radius);
            area = calculateAreaWithReturnBasedOnUser();
        }

    }

    static void calculateArea(double r) {
        if (r > 0) {
            double area = 3.14 * r * r;
            System.out.println("Area of a cicle with radius " + r + " is " + area);
        } else {
            System.out.println("Radius cannot be a non-positive number: " + r);
        }
    }

    static double calculateAreaWithReturn(double r) {
        if (r > 0) {
            double a = 3.14 * r * r;
            System.out.println("Area of a cicle with radius " + r + " is " + a);
            return a;
        } else {
            System.out.println("Radius cannot be a non-positive number: " + r);
            return -1;
        }
    }

    static double calculateAreaWithReturnBasedOnUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius as a double: ");
        double r = input.nextDouble();
        if (r > 0) {
            double a = 3.14 * r * r;
            System.out.println("Area of a cicle with radius " + r + " is " + a);
            return a;
        } else {
            System.out.println("Radius cannot be a non-positive number: " + r);
            return -1;
        }
    }

}
