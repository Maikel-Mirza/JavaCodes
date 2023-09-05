package week03_methods_arrays;

public class MethodDemo {
    public static void main(String[] args) {
    int r = max(10, 20);
    System.out.println(r);
    }


    static int max(int n1, int n2){
        int result;
        if(n1 > n2){
            result = n1;
        }
        else{
            result = n2;
        }
        return result;
    }

    static void myFunction(){
        System.out.println("Hello my name is bob");
    }
}

