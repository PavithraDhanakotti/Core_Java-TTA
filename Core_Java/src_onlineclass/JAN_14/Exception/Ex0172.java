package Core_Java.src_onlineclass.JAN_14.Exception;

public class Ex0172 {
    public static void main(String[] args) {


        try {
            String ip = args[0];
            int a = Integer.parseInt(args[0]);
            int b = 10 / a;
            System.out.println(a);
            System.out.println(b);
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {

            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // 100% executed
            System.out.println("I willbe executed anyHow This cock who can survive the nuclear attack");

        }
    }
}
