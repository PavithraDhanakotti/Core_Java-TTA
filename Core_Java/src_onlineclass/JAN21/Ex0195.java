package Core_Java.src_onlineclass.JAN21;
import java.util.Stack;
public class Ex0195 {
    public static void main(String[] args) {

        // Stack
        Stack<String> stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        //stack.push(123);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());


    }
}
