package Core_Java.src_practice;

import java.util.Stack;

public class Lab0027 {
    public static void main(String[] args) {
        // Stack - Class

        Stack name = new Stack();
        name.push("pavithraaa");
        name.push(12546);
        name.push(true);
        name.push("Dhanakotti");
        name.push("pavithra"); // Allows Duplicate

        System.out.println(name);
        System.out.println(name.pop());
        System.out.println(name);
        System.out.println(name.peek());
        System.out.println(name);
        System.out.println(name.push("Leela"));
        System.out.println(name);
        System.out.println(name.peek());
        System.out.println(name);

    }
}
