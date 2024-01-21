package Core_Java.src_onlineclass.DEC16_OPERATORSandCASTING;

public class Ex0044 {
    public static void main(String[] args) {
        // Decrement operator.

        int b = 10;
        System.out.println(--b + b++ + ++b);
        System.out.println(b);

        // A -> --b , Exp ->9 , b ->9
        // B -> b++ , Exp 9 , b ->  10
        // C , Exp -> 11 , b - 11

    }
}
