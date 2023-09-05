package week04_objects_classes;

public class CircleApp3 {
    public static void main(String[] args) {
        int i = 10;
        int[] array = new int[10];
        System.out.println(array);
        Circle circle = new Circle();
        System.out.println(circle);

        Circle c1 = new Circle(10.0);
        Circle c2 = new Circle(20.0);
        c1 = c2; // original c1 object will be destroyed
        c2.setRadius(100.0);
        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());
        c2.setRadius(1000.0);
        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());

    }
}
