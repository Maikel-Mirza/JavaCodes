import java.util.Scanner;

public class Triangle extends GeometricShape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        side1 = 3.0;
        side2 = 4.0;
        side3 = 5.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);

        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println(triangle.toString());
    }
}
