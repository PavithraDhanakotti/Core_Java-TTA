package Core_Java.src_onlineclass.JAN_06.Exercises_Con;
import java.util.Scanner;
public class Ex0137 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String, I will check for Palindrome");
        String user_input = scanner.next();
//        user_input = user_input.toLowerCase();
        boolean result = isPalindrome(user_input);
        if(result){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

    }

    static boolean isPalindrome(String userInput) {
        String original_str = userInput; //Pavithra , naman
        StringBuilder sb = new StringBuilder(userInput);
        String reverse_string = sb.reverse().toString(); // arhtivap , naman
        return original_str.equalsIgnoreCase(reverse_string); // arhtivaP == Pavithra , true
    }
}
