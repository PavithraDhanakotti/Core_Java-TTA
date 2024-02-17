package Core_Java.src_onlineclass.JAN_14.Exception;

public class Ex0173 {
    public static void main(String[] args) {

        int a = 0;
        try {
            a = Integer.parseInt(args[0]);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
        }

        try {
            int b = 10 / a;
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        }


        try {
            String ip = args[0];
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}

