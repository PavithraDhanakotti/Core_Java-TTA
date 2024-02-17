package Core_Java.src_onlineclass.JAN_14.Exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.rmi.server.ExportException;

public class Ex0175 {
    public static void main(String[] args)  {
        try {
            String path = "C://a.txt";
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
