package src_onlineclass.DEC23_LOOPandCONDITION;

import java.util.Scanner;

public class Ex0095 {
    public static void main(String[] args) {
        // problem --> Interview Question
        // Factorial Program
        // 1! -> 1
        // 2! ->2*1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();

        long fact=1;
//        int i=1;
//        while(i<= num){
//            fact = fact*i;
//            i++;
//        }

        for(int j=1; j<=num; j++){
            fact=fact+j;
        }
        System.out.println("FACT   "+ fact);
        sc.close();
    }
}
