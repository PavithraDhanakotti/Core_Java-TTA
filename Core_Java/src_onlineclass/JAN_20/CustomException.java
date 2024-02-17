package Core_Java.src_onlineclass.JAN_20;

public class CustomException extends Exception{

    public CustomException(String msg){
        super(msg);
        System.out.println("If I got this, Custom Exp");
    }
}