package week02_elementary_programming;

public class RelationalOperatorsExamples {

    public static void main(String[] args) {
        int radius = 5;
        System.out.println(radius == 5);
        // print -> Is radius is equal to 5? true
        System.out.println("Is radius is equal to 5? " + (radius == 5));

        boolean st = radius != 5;
        System.out.println("Is radius not equal to 5? " + st);

        boolean status = (radius >= 5);
        System.out.println("Status: " + status);

        boolean s = false;
    }

}
