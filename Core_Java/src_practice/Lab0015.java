package Core_Java.src_practice;

public class Lab0015 {
    // Thread can br created in 2 ways
    //1. Extend
    //2. Run
    public static void main(String[] args) {
// 1.Extend
        // exthreads t1 = new exthreads("Thread", "T1");
        // we hAVE TO WRITE TIME THE THREAD GROUP NAME TO GIVE IT A PERMANENT ONE SEE BELOW
        ThreadGroup TGName = new ThreadGroup("ThreadEmployee");
        exthreads t1 = new exthreads(TGName, "T1");
        exthreads t2 = new exthreads(TGName, "T2");
        t1.start();
        t2.start();
    }

    static class exthreads extends Thread{
        // Giving the thread group a name
        exthreads(ThreadGroup TGName, String Name){
            super.run();
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
