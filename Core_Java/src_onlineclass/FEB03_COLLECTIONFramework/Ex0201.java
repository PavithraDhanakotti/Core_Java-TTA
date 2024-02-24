package Core_Java.src_onlineclass.FEB03_COLLECTIONFramework;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ex0201 {
    public static void main(String[] args) {

        Queue pq1 = new PriorityQueue();
        // FIFO -> 1 -> BOARD THE PLANE, Train
        // A, B, C -> A, B, c

        // Offer - Add
        // PQ  -> Sorted

        pq1.offer(20);
        pq1.offer(10);
        pq1.offer(30);
        pq1.offer(40);
        pq1.offer(null);

        pq1.add(90);



        System.out.println(pq1);
//        System.out.println(pq1.poll());
//        System.out.println(pq1);
//        System.out.println(pq1.peek());





    }
}
