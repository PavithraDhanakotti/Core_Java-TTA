package Core_Java.src_practice;

public class Lab0018 {
    // DeadLock

    public static void main(String[] args) {
     final String r1="ATB";
   final String r2 ="PTB";

        Thread t1 = new Thread();
        synchronized (r1){
            System.out.println("Threaad 1: Locked resouce 1");
            try{
                Thread.sleep(100);
            }catch (Exception w){

            }
            synchronized (r2){
                System.out.println("Thread 1: Locked resource 2");
            }
        };

        Thread t2 = new Thread();
        synchronized (r2){
            System.out.println("Threaad 2: Locked resouce 2");
            try{
                Thread.sleep(100);
            }catch (Exception w){

            }
            synchronized (r1){
                System.out.println("Thread 2: Locked resource 1");
            }
        };

        t1.start();
        t2.start();


    }

}
