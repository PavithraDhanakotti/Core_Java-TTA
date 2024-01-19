package src_onlineclass.DEC16_OPERATORSandCASTING;
import java.util.Scanner;
public class Ex0048 {
    public static void main(String[] args) {
        // Take three input from user and give max out of two number
        // a,b  a>b -> a, else b

        Scanner sc = new Scanner(System.in); // OOps
        System.out.println("Enter the a,b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Max is " + a);
        } else {
            System.out.println("Max is " + b);
        }
        // concatenation - combine two or more things
    }
}
