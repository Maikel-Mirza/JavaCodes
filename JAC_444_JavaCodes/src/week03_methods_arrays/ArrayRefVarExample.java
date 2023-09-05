package week03_methods_arrays;

public class ArrayRefVarExample {
    public static void main(String[] args) {
        double[] myArray1 = new double[10];
        double[] myArray2 = myArray1;

        myArray1[1] = 10;

        for (int i = 0; i < myArray1.length; i++) {
            System.out.print(myArray1[i] + ", ");
        }

        System.out.println("\n************");

        for (int i = 0; i < myArray2.length; i++) {
            System.out.print(myArray2[i] + ", ");
        }

        System.out.println("\n************");

        myArray2[2] = 20;

        for (int i = 0; i < myArray1.length; i++) {
            System.out.print(myArray1[i] + ", ");
        }

        System.out.println("\n************");

        for (int i = 0; i < myArray2.length; i++) {
            System.out.print(myArray2[i] + ", ");
        }

        System.out.println("\n>>> END <<<");
    }
}
