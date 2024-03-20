package Core_Java.src_practice;


import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;


public class Lab0032 {
    public static void main(String[] args) {
        Map a= new TreeMap<>();
//        Map a = new LinkedHashMap<>();
        a.put("Name",123);
        System.out.println(a);
    }
}
