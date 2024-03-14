package Core_Java.src_practice;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab0029 {
    public static void main(String[] args) {
        // Queue
        // FIFO -> First in First out

        //Priority Queue
        // Arranged in order

        Queue <Integer> myq = new PriorityQueue();
        myq.add(12);
        myq.add(13);
        myq.add(11);
        myq.offer(15);
//        Collections.sort(myq); we cant use only in List
        System.out.println(myq);
        System.out.println(myq.peek());
        System.out.println(myq.poll());
        System.out.println(myq);
        System.out.println(myq.remove(13));
        System.out.println(myq);
        System.out.println(myq.remove());
        System.out.println(myq);
    }
}
