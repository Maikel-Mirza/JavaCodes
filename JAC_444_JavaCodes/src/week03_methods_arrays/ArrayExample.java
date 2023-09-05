package week03_methods_arrays;

public class ArrayExample {
    public static void main(String[] args) {
        double var;
        double[] myArray;

        var = 10.5;
        myArray = new double[10];

        double[] myArray2 = new double[10];

        double[] myArray3 = {1.2, 3.4, 5.6, 7.8};

        System.out.println(var);
        System.out.println(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Math.random();
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        System.out.println(">>> END <<<");
    }
}
