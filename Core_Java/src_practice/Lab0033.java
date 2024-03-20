package Core_Java.src_practice;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Lab0033 {
    public static void main(String[] args) {
        String msg = "Hello World, Hello everyone, My name is Pavithra ";
        String [] words = msg.split(" ");
        //        System.out.println(words);


        Map <String,Integer> wordsmap = new HashMap<>();
        for( String s : words) {
            Integer count = wordsmap.get(s);
            if (count == null) {
                wordsmap.put(s, 1);
            } else {
                wordsmap.put(s, count++);
            }
        }



//        for(String a: words){
////            System.out.print(a);
////            System.out.println("              ");
//            System.out.println(a);


    }
}
