package src_onlineclass.DEC24_ARRAY;

import java.util.Scanner;

public class Ex0105 {
    public static void main(String[] args) {

        // Take input from the user for marks of 5 subject and print the marks
        Scanner sc = new Scanner((System.in));
        float[] marks = new float[5];
        System.out.println("Enter the First Subject");
        marks[0] = sc.nextFloat();
        System.out.println("Enter the Second Subject");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the Third Subject");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the Fourth Subject");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the Fifth Subject");
        marks[4] = sc.nextFloat();

        for (float mark : marks) {
            if (mark < 30) {
                System.out.println("You are fail in the subject  " + mark);
            }
            System.out.println(mark);
        }
    }
}
