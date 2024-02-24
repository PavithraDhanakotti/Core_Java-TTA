package Core_Java.src_onlineclass.FEB03_COLLECTIONFramework;
import java.util.HashSet;
import java.util.Set;

public class Ex0197 {
    public static void main(String[] args) {


        Set<String> fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("apple");
        fruits.add("Water Melon");
//        fruits.add(123);
        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.size());
        System.out.println(fruits.contains("apple"));


    }
}
