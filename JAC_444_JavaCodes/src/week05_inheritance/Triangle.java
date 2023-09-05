package week05_inheritance;

import java.util.Scanner;


public class Triangle extends GeometricShape {

    private double side1 = 3.0;
    private double side2 = 4.0;
    private double side3 = 5.0;
    public Triangle() { // no-arg constructor

    }
    public Triangle(double side1, double side2, double side3) {
            side1 = this.side1;
            side2 = this.side2;
            side3 = this.side3;
    }
    public Triangle(double a, double p, String colour, boolean filled) {
      // this.setArea(a);
       this.setPerimeter(p);
       this.setColour(colour);
       this.setFilled(filled);
    }
    public double getPerimeter(){
        double p;
        return p = side1 + side2 + side3;
    }
    public void setPerimeter(double p){
        p = this.getPerimeter();
    }
    public double getArea(){
        double p;
        p = this.getPerimeter();
        double a;
        return a = Math.sqrt((p/2)*(p/2 - side1)*(p/2 - side2)*(p/2  - side3));
    }
//    public void setArea(double p) {
//        p = this.getPerimeter();
//        double a;
//    }
    public void printTriangle() {
    System.out.println(this.toString());
}

    public String toString() {
        return super.toString() +
                "\nTriangle: " + "side1 = " + side1 + ", " +  "side2 = " + side2 + ", " +  "side3 = " + side3 +
                "\nArea: " + this.getArea() +
                "\nPerimeter: " + this.getPerimeter() +
                "\nColour: " + this.getColour() +
                "\nFilled: " + this.isFilled();
    }


    public static void main(String[] args) {
        Triangle t;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first side of the Triangle:\n");
        double side1 = sc.nextInt();
        System.out.println("Enter the second side of the Triangle:\n");
        double side2 = sc.nextInt();
        System.out.println("Enter the third side of the Triangle:\n");
        double side3 = sc.nextInt();
        System.out.println("Enter the colour of the Triangle:\n");
        String colour = sc.next();
        boolean isFilled = true;
        System.out.println("Enter 1(Filled) or 0(Not Filled) to indicate whether the triangle is filled or not: ");
        int fill = sc.nextInt();
        if(fill == 1){
            System.out.println(isFilled);
        }
        if(fill == 0){
            isFilled = false;
            System.out.println(isFilled);
        }

    }
}
