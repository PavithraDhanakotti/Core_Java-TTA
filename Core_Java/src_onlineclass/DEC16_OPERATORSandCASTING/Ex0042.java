package Core_Java.src_onlineclass.DEC16_OPERATORSandCASTING;

public class Ex0042 {
    public static void main(String[] args) {

        // Increment operator.
        int b = 10;
        System.out.println(++b + b++);
        System.out.println(b);

        // A - ++b -> Exp - 11 , b -> 11
        // B - b++ -> Exp - 11 , b -> 12
        // A+B -> 22
        /// b -> 12
    }
}
