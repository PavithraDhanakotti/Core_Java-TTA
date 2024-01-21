package Core_Java.src_onlineclass.DEC16_OPERATORSandCASTING;

public class Ex0023 {
    public static void main(String[] args) {

        // || -> OR
        // True || True = True (1)
        // True || False = False (0)
        // False || True = True
        // False || False = False

        System.out.println( true || false);
        System.out.println( false || true);
        System.out.println( true || true);
        System.out.println( false || false);

        // && -> And
        // True || True = True (1)
        // True || False = False (0)
        // False || True = False
        // False || False = False

        System.out.println( true && false);
        System.out.println( false && true);
        System.out.println( true && true);
        System.out.println( false && false);

    }
}
