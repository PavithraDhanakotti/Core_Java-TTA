package Core_Java.src_practice;

public class Lab0017 {
    // Synchronization
    public static void main(String[] args) {
        sync s1 = new sync();

        A ta = new A(s1, "A");
        ta.start();
        B tb = new B(s1, "B");
        ta.start();
    }
static class A extends Thread{
        sync s;
        public A (sync s , String tname){
            super(tname);
            this.s=s;
        }

    @Override
    public void run() {
        s.m1();
    }
}
static class B extends Thread{
        sync s;
        public B (sync s , String tname){
            super(tname);
            this.s=s;
        }

        @Override
        public void run() {
            s.m2();
        }
    }
    static class sync {
        // this is non sync
        // void m1(){
        //
        // this sync
        synchronized void m1() {
            Thread th = Thread.currentThread();
            for (int i=1; i <= 105; i++) {
                System.out.println(th.getName() + " -m1 -" + i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
            }
        }

        synchronized void m2(){
            Thread th = Thread.currentThread();
            for ( int i =101; i<=105; i++){
                System.out.println(th.getName()+ " -m2 -" + i);
                try{
                    Thread.sleep(1000);
                }catch (Exception e){

                }
            }
        }
    }
}
