package Core_Java.src_onlineclass.DEC30_ARRAY;

import java.util.Scanner;

public class Ex0121 {
    public static void main(String[] args) {

//        int a =10;
//        int b=23;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value for A");
        int a = sc.nextInt();
        System.out.println("Enter Value for B");
        int b = sc.nextInt();
        System.out.println(" The value of A and B is " + a + " " + b);

        int temp = a;
        a =b;
        b = temp;

        System.out.println(" Swap value of A and B is " + a + " " + b);


    }
}
