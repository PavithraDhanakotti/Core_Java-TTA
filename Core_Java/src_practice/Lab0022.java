package Core_Java.src_practice;

import java.util.List;

public class Lab0022 {
    public static void main(String[] args) {
        //Collection Framework
        // List

        List names = List.of("Dhanakotti","Suguna","Pavithra","Leela Anand");
        List numbers = List.of(5,52,76,86);
        System.out.println(names.get(2));
        System.out.println(numbers.get(1));
        System.out.println(names.size());
        System.out.println(numbers.indexOf("Leela anand"));



    }
}
