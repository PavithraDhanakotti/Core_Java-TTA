package Core_Java.src_onlineclass.JAN_21;
import java.util.Enumeration;
import java.util.Vector;
public class Ex0192 {
    public static void main(String[] args) {
        Vector<String> v2 = new Vector();
        v2.add("pramod");
        v2.add("pr");
        v2.add("adsda"); // Array - can store simirlar only

        Enumeration e  = v2.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }


    }
}
