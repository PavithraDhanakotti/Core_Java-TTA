package Core_Java.src_practice;


import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Hashtable;


public class Lab0032 {
    public static void main(String[] args) {
        Map a= new TreeMap<>();
        a.put("Name",123);
        a.put("Name",145); // Updating to a new value
        a.put("Age",12);
        a.put("123",895);
        System.out.println(a);

//        a.put(123,123); this will not give red-underline error but while executing it will as it is a different datatype

        // But not in case of LinkedHashmap
        //Whatever the user enters it will display in the same order but in case of Tree Map it will arrange in a order.
        Map m = new LinkedHashMap();
        m.put("Name", "Pavithra");
        m.put(1,2);
        m.put(1,"Hello");
        m.put("Hi",465);
        System.out.println(m);

        /*
         * HashTable
         Never accepts null value
        Thread Safe
         Synchronised
         *
         */


        Map h =new Hashtable();
        h.put("Pavithra","PAvi");
        h.put(null,"hello");
        System.out.println(h);

    }
}
