package Core_Java.src_practice;

public class Lab0016 {

//    2. Runnable
public static void main(String[] args) {

    ThreadGroup threadsname = new ThreadGroup("Working Threads");

    Runnable runn =new workthreads(threadsname, "W1");
    Thread t1 = new Thread(runn);
    t1.start();

    Runnable ru2 = new workthreads(threadsname,"W2");
    Thread t2 = new Thread(ru2);
    t2.start();


}
static class workthreads implements Runnable{

    workthreads(ThreadGroup TGName, String Name) {

    }

    @Override
    public void run() {
        for ( int i =0; i <5; i++){
            try{
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
}
