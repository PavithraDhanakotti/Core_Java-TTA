package Core_Java.src_practice;
import java.util.*;

public class Lab0023 {

    public static void main(String[] args) {
        // Collection Framework
        // List - Interface
        // Sub categories -> ArrayList, LinkedList, Stack, Vector

        // Those sub categories are classes

        // Arraylist

        //List mylist = new List(); -> We can't create an object of an interface
        List mylist = new ArrayList();
        //or
        Collection mylist1 = new ArrayList(); // Collection is an Gand father of Arraylist

        mylist.add("Pavithra");
        mylist.add("Leela Anand");
        mylist.add(123);
        mylist.add(true);
        mylist.add(true); // Allows Duplicates

        System.out.println(mylist);
        System.out.println(mylist.size());
        System.out.println(mylist.remove(true));
        System.out.println(mylist);
        mylist.add(true);
        mylist.add(true);
        System.out.println(mylist);
        mylist.set(5,false);
        System.out.println(mylist);
        System.out.println("---------------------------------");

        // To execute - 3 ways
        // For loop, For Each, Iterator

        // For Loop
        for (int i =0; i<mylist.size(); i++){
            System.out.println(mylist.get(i));
        }

        System.out.println("---------------------------------");

        //For Each
        for(Object o: mylist){
            System.out.println(o);
        }

        System.out.println("---------------------------------");

        // Iterator
        Iterator iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
