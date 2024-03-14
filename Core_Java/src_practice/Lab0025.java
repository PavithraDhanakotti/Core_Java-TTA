package Core_Java.src_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab0025 {
    public static void main(String[] args) {

//        other was to iterator
        // Iterator - > List Iterator
        List courseList1 = new ArrayList();
        courseList1.add("ATB");
        courseList1.add("BTB");
        courseList1.add("CTB");
        courseList1.add("DTB");
        courseList1.add("ETB");
        System.out.println(courseList1);
        System.out.println("---------------------------------");

        ListIterator lt = courseList1.listIterator();
        while (lt.hasPrevious()){
            // we can't add in between
            // courseList1.add("DTB")
// we can add like this
            lt.add("DTB");
            System.out.println(lt.previous());
        }
        System.out.println();
    }
}
