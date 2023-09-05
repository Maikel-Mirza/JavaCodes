package week04_objects_classes;

public class Circle {
    // Data fields
    private double radius = 2.0; // radius - numerical data types by default are zero - int 0 - double 0.0
    private static String colour = "White";

    // Constructors
    public Circle() { // no-arg constructor
    }

    public Circle(double newRadius) { // single parameter constructor
        radius = newRadius;
    }

    // Methods
    public double getArea() {
        return radius * radius * 3.14;
    }

    public static double squareFn(int i) {
        return i * i;
    }

    public double getRadius() {
        return radius;
    }

    public static String getColour() {
        return colour;
    }

    public static void setColour(String colour) {
        Circle.colour = colour;
    }

    public void setRadius(double newRadius) {
        if (newRadius > 0)
            radius = newRadius;
        else
            System.out.println("Radius cannot be non-positive");
    }

    public static void main(String[] args) {
        int i;
        double d;
        Circle c;

        i = 0;
        d = 0.1;
        c = new Circle();

        Circle c1 = new Circle(); // call no-arg constructor
//        System.out.println(c1.radius); // access data fields // Error

        Circle c2 = new Circle(10.0); // // call single parameter constructor
        c2.setRadius(20.0); // how to call setter/mutator method
        System.out.println("c2 area is " + c2.getArea()); // how to call getter/accessor method

        Circle c3 = new Circle();
//        c3.radius = -1.0; // Error
        c3.setRadius(10.0);
    }
}
