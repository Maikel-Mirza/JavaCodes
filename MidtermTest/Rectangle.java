import java.util.Scanner;

public class Rectangle extends GeometricShape {
    private double width; // width of the rectangle
    private double height; // height of the rectangle
    private String color; // color of the rectangle
    private boolean filled; // indicates whether the rectangle is filled or not

    public Rectangle() {
        this(3.0, 4.0); // Default width and height
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
    }

    public String toString() {
        return "Rectangle: width = " + width + ", height = " + height + ", color = " + color + ", filled = " + filled;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the color of the rectangle: ");
        String color = scanner.nextLine();

        System.out.print("Is the rectangle filled? (true/false): ");
        boolean filled = scanner.nextBoolean();

        Rectangle rectangle = new Rectangle(width, height);
        rectangle.setColor(color);
        rectangle.setFilled(filled);

        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        scanner.close();
    }
}
