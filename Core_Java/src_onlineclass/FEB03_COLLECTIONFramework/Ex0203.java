package Core_Java.src_onlineclass.FEB03_COLLECTIONFramework;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ex0203 {
    public static void main(String[] args) {
        Queue integerQueue = new PriorityQueue<>();
        integerQueue.add("A");
        integerQueue.add("B");
        integerQueue.add("C");
        System.out.println(integerQueue);
        integerQueue.poll();
        System.out.println(integerQueue);

        Iterator iterator = integerQueue.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }



    }
}
