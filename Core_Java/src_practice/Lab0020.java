package Core_Java.src_practice;

public class Lab0020 {
    // Custom Throw
    public static void main(String[] args) {

        extracted(5);
        extracted1(4);

    }

    public static void extracted(int b) {
        int a = 10/b;
        System.out.println(a);
    }

    private static void extracted1 (int c){
        int d;
        if (c<=0){
            throw new ArithmeticException("D is not less than c");
        }else {
            d = 20/c;
        }
            System.out.println(d);
        }

}
