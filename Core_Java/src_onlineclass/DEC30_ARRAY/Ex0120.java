package Core_Java.src_onlineclass.DEC30_ARRAY;

public class Ex0120 {
    public static void main(String[] args) {

        int b = 10;
        System.out.println(--b + b++ + b--);
        // A - Expression value =  9, b value = 9
        // B - Expression value =  9, b value = 10
        // C - Expression value = 10, b value = 9
        //                                    + 28
    }
}
