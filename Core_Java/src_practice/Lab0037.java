package Core_Java.src_practice;
import java.util.*;

public class Lab0037 {

    public static void main(String[] args) {
        List l = new LinkedList(); // user insertion
        l.add("Pavithra");
        l.add("Leela");
        l.add("Anand");
        l.add("Aalya");
        l.add("Dhanakotti");
        l.add("Suguna");
        l.add("123");
        l.add(123);
        l.add(112);

        System.out.println(l);
        System.out.println("==========================================");
        ListIterator iterator = l.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("==========================================");
        Set s = new HashSet(); // random order we don't know
        s.add("Pavithra");
        s.add("Leela");
        s.add("Anand");
        s.add("Aalya");
        s.add("Dhanakotti");
        s.add("Suguna");
        s.add("123");
        s.add(123);
        s.add(112);
        System.out.println(s);
        System.out.println("==========================================");
        for(Object ss: s){
            System.out.println(ss);
        }
        System.out.println("==========================================");
        Set lhs = new LinkedHashSet();
        lhs.add("Pavithra");
        lhs.add("Leela");
        lhs.add("Anand");
        lhs.add("Aalya");
        lhs.add("Dhanakotti");
        lhs.add("Suguna");
        lhs.add("123");
        lhs.add(123);
        lhs.add(112);
        System.out.println(lhs);
        System.out.println("==========================================");
        for(Object lh: lhs){
            System.out.println(lh);
        }
        System.out.println("==========================================");

        Set<Integer> ts = new TreeSet<>(); // Sort in order
        ts.add(1230); // 3
        ts.add(1230); // duplicate
        ts.add(4561); // 4
        ts.add(0001); //1
        ts.add(4568); // 5
        ts.add(845); // 2
        ts.add(975621); // 7
        ts.add(31654); // 6
        System.out.println(ts);

        for( Integer is: ts){
            System.out.println(is);
        }
    }
}
