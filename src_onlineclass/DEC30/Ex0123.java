package src_onlineclass.DEC30;

import java.util.Scanner;

public class Ex0123 {
    public static void main(String[] args) {
//Interview
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value for A");
        int a = sc.nextInt();
        System.out.println("Enter Value for B");
        int b = sc.nextInt();
        System.out.println(" The value of A and B is " + a + " " + b);

        a = a*b;
        b= a/b;
        a = a/b;

        System.out.println(" Swap value of A and B is " + a + " " + b);
    }
}
