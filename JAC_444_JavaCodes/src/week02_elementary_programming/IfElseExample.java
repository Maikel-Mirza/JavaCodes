package week02_elementary_programming;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius as a double: ");
        double radius = input.nextDouble();

        if (radius > 0) {
            double area = 3.14 * radius * radius;
            System.out.println("Area of a circle with radius " + radius + " is " + area);
        } else {
            System.out.println("Radius cannot be a non-positive number: " + radius);
        }
    }
}
