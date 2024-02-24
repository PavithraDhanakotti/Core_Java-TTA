package Core_Java.src_onlineclass.JAN20;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Ex0182 {
    public static void main(String[] args) {

        String path = "C:/a.txt";
        try {
            FileInputStream f = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
