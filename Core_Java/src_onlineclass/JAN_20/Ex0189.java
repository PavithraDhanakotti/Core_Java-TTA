package Core_Java.src_onlineclass.JAN_20;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Ex0189 {
    public static void main(String[] args) {

        List<String> myList = new LinkedList();
        myList.add("Pramod");
        myList.add("Dutta");
        System.out.println(myList);

        List<Integer> l = new LinkedList<Integer>();
        // Now add elements to the Link List
        l.add(2);
        l.add(3);
        l.add(4);

        Iterator iterator = l.iterator();
        while (iterator.hasNext()){ //t,t,t,f
            //l.add(5); Not possible
            System.out.println(iterator.next()); //2,3,4
        }






    }
}
