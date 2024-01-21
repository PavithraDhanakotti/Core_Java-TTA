package Core_Java.src_onlineclass.DEC23_LOOPandCONDITION;

import java.util.Scanner;

public class Ex0095 {
    public static void main(String[] args) {
        // problem --> Interview Question
        // Factorial Program
        // 1! -> 1
        // 2! ->2+1

        // Sum of Digit = 5+4+3+2+1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();

        long fact=0;
        // 5  -> i = 1 to 5 ->  fact = fact * i , i++
        // A -> int i = 1;
        // B -> i <=number or i < =5
        // C -> i++
        // D -> fact = fact+i


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
