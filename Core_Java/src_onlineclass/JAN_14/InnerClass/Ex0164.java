package Core_Java.src_onlineclass.JAN_14.InnerClass;

public class Ex0164 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am THREAD!!");
            }
        };

    }
}
