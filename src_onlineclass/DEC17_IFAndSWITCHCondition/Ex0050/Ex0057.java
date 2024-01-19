package src_onlineclass.DEC17_IFAndSWITCHCondition.Ex0050;
import java.util.Scanner;
public class Ex0057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser Name chrome, firefox, edge, opera");
        // 1 ->  Monday, 7 -> Sunday,  MTWTFSS , invalid -> 99 - are you mad?
        String browser = sc.nextLine();

        switch (browser.toLowerCase()) {
            case "chrome":
                System.out.println("Execute the Chrome Code");
                break;
            case "firefox":
                System.out.println("Execute the Firfox Code");
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;
            default:
                System.out.println("I have not idea which browser is this");
        }
    }
}
