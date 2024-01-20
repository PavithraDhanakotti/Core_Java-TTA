package src_onlineclass.DEC30_ARRAY;

import java.util.Scanner;

public class Ex0127 {
    public static void main(String[] args) {

        //Prime number calculator
        int i=0;
        int flag = 0;
        int m=0;

        Scanner sc= new Scanner (System.in);
        System.out.println("Enter your Number");
        int n = sc.nextInt();

        m=n/2;
        if (n==0 || n==1){
            System.out.println("Not a Prime Number" + n);
        } else {
            for (i =2; i<=m; i++){
                if (n%i ==0){
                    System.out.println("Not a Prime Number");
                    flag=1;
                    break;
                }
            }

        }
        if (flag ==0){
            System.out.println(n + " is a Prime Number");
        }
    }
}
