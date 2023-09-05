package week02_elementary_programming;

public class WhileLoopExample {

    public static void main(String[] args) {
        int count = 0;

        while (count < 100) {
            System.out.println((count + 1) + ": Welcome to JAC444");
            count++; // count += 1; or count = count + 1;
        }

        System.out.println("***************************");

        count = 0;
        do {
            System.out.println((count + 1) + ": Welcome to JAC444");
            count++;
        } while (count < 100);

        System.out.println("***************************");

        for (int i = 0; i < 100; i++) {
            System.out.println((i + 1) + ": Welcome to JAC444");
        }

    }

}
