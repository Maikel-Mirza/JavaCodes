package week04_objects_classes;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        int i;
        double d;
        Circle c;
        Scanner input;

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
