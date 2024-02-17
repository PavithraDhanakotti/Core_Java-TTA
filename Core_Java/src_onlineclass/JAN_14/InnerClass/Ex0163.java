package Core_Java.src_onlineclass.JAN_14.InnerClass;

public class Ex0163 {
    public static void main(String[] args) {
        Thread t=  new Thread(){
            @Override
            public void run(){
                System.out.println("I am a THREAD!");
            }
        };
        t.run();


    }
}
