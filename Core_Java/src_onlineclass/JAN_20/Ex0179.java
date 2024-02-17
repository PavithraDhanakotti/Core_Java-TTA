package Core_Java.src_onlineclass.JAN_20;

import java.io.FileReader;
import java.io.File;


public class Ex0179 {
    public static void main(String[] args) throws Exception {
        main("Pramod");
    }

    static void main(String a) throws Exception{

        // Code 100

        //101
        FileReader f = new FileReader(new File("C://a/txt"));

        if(a.equalsIgnoreCase("a")){
            throw new ArithmeticException();
        }

        // Code 100
    }
}