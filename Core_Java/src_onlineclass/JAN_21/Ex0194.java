package Core_Java.src_onlineclass.JAN_21;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Ex0194 {
    public static void main(String[] args) {
        List<Integer> myMakrs = new ArrayList<>();
        myMakrs.add(91);
        myMakrs.add(87);
        myMakrs.add(80);
        Collections.sort(myMakrs);
        System.out.println(myMakrs);

    }
}
