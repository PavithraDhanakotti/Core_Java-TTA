package Core_Java.src_practice;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab0035 {
    public static void main(String[] args) {
// Hashtable is legacy class
        Hashtable<Integer, String> h1 =new Hashtable<>();
        h1.put(1,"One");
        h1.put(2,"Two");
        h1.put(3,"Three");

//        to Iterate
        Enumeration<Integer> e = h1.keys();
        while (e.hasMoreElements()){
            // Getting the key of a particular entry
            int key = e.nextElement();

            //Print and display the rank and name
            System.out.println("Rank : "+ key + "\t\t Name : "+ h1.get(key));
        }

    }
}
