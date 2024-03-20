package Core_Java.src_practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lab0036 {
    public static void main(String[] args) {
        // Using Iterator in Hashmap

        HashMap<Integer,String> h = new HashMap<Integer,String>();
        h.put(99,"Pavithra");
        h.put(74,"Leela");
        h.put(51,"Anand");
        h.put(38,"Dhanakotti");
        h.put(62,"Suguna");


        for (Map.Entry<Integer,String> e: h.entrySet()){
            System.out.println(e.getKey()+ " -> "+ e.getValue());
        }
        System.out.println("===================================");
        //Iterator way
        Set set = h.entrySet();
        Iterator ite = set.iterator();
        while (ite.hasNext()){
            Map.Entry<Integer,String > map = (Map.Entry)ite.next();
            System.out.println(map.getKey()+" -> "+map.getValue());
        }


    }
}
