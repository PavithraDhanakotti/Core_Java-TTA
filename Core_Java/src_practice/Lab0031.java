package Core_Java.src_practice;

import java.util.HashMap;
import java.util.Map;


public class Lab0031 {
    public static void main (String[] args){

        HashMap<Integer, String> hasmap1 = new HashMap<>();
        hasmap1.put(1,"Pavi");
        hasmap1.put(2,"Pavit");
        hasmap1.put(3,"Pavith");
        hasmap1.put(4,"Pavithr");
        hasmap1.put(1,"Pavithra");
        System.out.println(hasmap1);

        hasmap1.replace(1,"Pavithra","Pavit");
        System.out.println(hasmap1);
        hasmap1.replace(1,"PAVITHRA");
        System.out.println(hasmap1);
        hasmap1.remove(1);
        System.out.println(hasmap1);
        hasmap1.remove(100);
        System.out.println(hasmap1);
        hasmap1.putIfAbsent(100,"WOW");
        System.out.println(hasmap1);
    }
}
