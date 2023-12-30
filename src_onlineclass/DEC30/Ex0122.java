package src_onlineclass.DEC30;

import java.util.Scanner;

public class Ex0122 {
    public static void main(String[] args) {
//Interview
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value for A");
        int a = sc.nextInt(); // 10
        System.out.println("Enter Value for B");
        int b = sc.nextInt(); //9
        System.out.println(" The value of A and B is " + a + " " + b);

        a = a+b; // 10+9 = 19
        b= a-b;  // 19-9 =10
        a = a-b; // 19-10  9
        System.out.println(" Swap value of A and B is " + a + " " + b);

    }
}
