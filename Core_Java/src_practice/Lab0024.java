package Core_Java.src_practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab0024 {
    public static void main(String[] args) {
        // List
        // Instead of using a common object we can give a specific datatypes

//        List <String> courseList = new ArrayList<>();
        List courseList = new ArrayList();
        courseList.add("ATB");
        courseList.add("BTB");
        courseList.add("CTB");
        courseList.add("DTB");
        courseList.add("ETB");
        System.out.println(courseList);
        System.out.println("---------------------------------");

        //List<Integer> numerlist = new ArrayList<>(); in case we want to add two set of list it will be difficult because this is int and the other one is string , it will be better to avoid specific DT for one case
        List<Integer> numerlist = new ArrayList();
//        List numerlist = new ArrayList();
        numerlist.add(123);
        numerlist.add(456);
        numerlist.add(789);
        numerlist.add(147);
        numerlist.add(258);
        System.out.println(numerlist);
        System.out.println("---------------------------------");


        courseList.addAll(numerlist);
        System.out.println(courseList);
        System.out.println("---------------------------------");

        Iterator iterator = courseList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("---------------------------------");


    }
    }

