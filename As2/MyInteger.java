public class MyInteger {
    private int value;

    public MyInteger(int newValue) {
        value = newValue;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.getValue();
    }

    public static void main(String[] args) {
        MyInteger number1 = new MyInteger(12);
        MyInteger number2 = new MyInteger(7);

        System.out.println("number1 isEven? " + number1.isEven());
        System.out.println("number1 isOdd? " + number1.isOdd());
        System.out.println("number1 equals 12? " + number1.equals(12));
        System.out.println("number1 equals number2? " + number1.equals(number2));

        System.out.println("number2 isEven? " + MyInteger.isEven(7));
        System.out.println("number2 isOdd? " + MyInteger.isOdd(7));
        System.out.println("number2 equals 7? " + number2.equals(7));
        System.out.println("number2 equals number1? " + number2.equals(number1));
    }
}
