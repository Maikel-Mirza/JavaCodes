package week05_inheritance;

public class Circle extends GeometricShape {
    // data field
    private double radius; // default: 0.0

    // constructors
    public Circle() { // no-arg constructor

    }

    public Circle(double radius) {
        super(); // optional
        this.setRadius(radius);
    }

//    public Circle(double radius, String colour, boolean filled) {
//        this.setRadius(radius);
//        this.setColour(colour);
//        this.setFilled(filled);
//    }

    public Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * 3.14;
    }

    public double getPerimeter() {
        return 2 * this.radius * 3.14;
    }

    public double getDiameter() {
        return 2 * this.radius;
    }

//    public void printCircle() {
//        System.out.println("colour: " + this.getColour() +
//                "\nfilled: " + this.isFilled() +
//                "\ndateCreated: " + this.getDateCreated() +
//                "\nradius: " + this.getRadius());
//    }

//    public void printCircle() {
//        System.out.println(super.toString() +
//                "\nradius: " + this.getRadius());
//    }

    public void printCircle() {
        System.out.println(this.toString());
    }

//    @Override
//    public String toString() {
//        return "colour: " + this.getColour() +
//                "\nfilled: " + this.isFilled() +
//                "\ndateCreated: " + this.getDateCreated() +
//                "\nradius: " + this.getRadius();
//    }

    @Override
    public String toString() {
        return super.toString() +
                "\nradius: " + this.getRadius();
    }

    // Overload
    public String toString(int i) {
        return super.toString() +
                "\n" + i +
                "\nradius: " + this.getRadius();
    }
}
