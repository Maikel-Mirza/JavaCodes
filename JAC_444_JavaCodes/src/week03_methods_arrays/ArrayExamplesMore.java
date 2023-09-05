package week03_methods_arrays;

public class ArrayExamplesMore {

    public static void main(String[] args) {
        double[] myList = new double[100];

//		Scanner input = new Scanner(System.in);		
//		System.out.print("Enter " + myList.length + " values: ");
//		for (int i = 0; i < myList.length; i++) {
//			myList[i] = input.nextDouble();
//		}

        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 100;
        }

        System.out.println(myList); // prints the memory address of the first element
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }

    }

}
