package week04_objects_classes;

public class CircleApp2 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("circle1 radius: " + circle1.getRadius());
        System.out.println("circle1 colour: " + Circle.getColour());

        System.out.println("************************");

        Circle circle2 = new Circle();
        circle2.setRadius(10.0);
        Circle.setColour("Blue");
        System.out.println("circle2 radius: " + circle2.getRadius());
        System.out.println("circle2 colour: " + Circle.getColour());

        System.out.println("************************");

        System.out.println("circle1 radius: " + circle1.getRadius());
        System.out.println("circle1 colour: " + Circle.getColour());
    }
}
