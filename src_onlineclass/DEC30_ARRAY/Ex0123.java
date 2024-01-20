package src_onlineclass.DEC30_ARRAY;

import java.util.Scanner;

public class Ex0123 {
    public static void main(String[] args) {
//Interview
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Value for A");
            int a = sc.nextInt();
            System.out.println("Enter Value for B");
            int b = sc.nextInt();
            System.out.println(" The value of A and B is " + a + " " + b);

            a = a * b;
            b = a / b;
            a = a / b;

            System.out.println(" Swap value of A and B is " + a + " " + b);
        } catch (Exception e) {
            System.out.println("Not Possible Zero");
        }

        //        // bitwise xor
//        a = a ^ b; // BINARY AND XOR GATE
//        b = a ^ b;
//        a = a ^ b;

    }
}
