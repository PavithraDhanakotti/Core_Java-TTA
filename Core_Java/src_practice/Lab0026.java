package Core_Java.src_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab0026 {

    public static void main(String[] args) {
        // sorting in list
        List < Integer> Marks = new ArrayList<>();
        Marks.add(91);
        Marks.add(36);
        Marks.add(64);
        Marks.add(72);
        Marks.add(85);
        System.out.println(Marks);
        Collections.sort(Marks);
        System.out.println("---------------------------------");
        System.out.println(Marks);

        System.out.println("---------------------------------");
        List<String> name = new ArrayList<>();
        name.add("Pavithra");
        name.add("Leela Anand");
        name.add("Dhanakotti");
        name.add("Suguna");
        System.out.println(name);
        System.out.println("---------------------------------");
        Collections.sort(name);
        System.out.println(name);

    }
}
