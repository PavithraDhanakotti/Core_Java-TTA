package Core_Java.src_practice;

public class Lab0019 {
    public static void main(String[] args) {
        Lab0019 tdSolution = new Lab0019();
        final  r1 a = tdSolution.new r1();
        final  r2 aa = tdSolution.new r2();

        Runnable b1 = new Runnable() {
            @Override
            public void run() {
                synchronized (aa){
                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (a){
                        System.out.println("In block 1");
                    }
                }
            }
        };

        Runnable b2 = new Runnable() {
            @Override
            public void run() {
                synchronized (a){
                    try{
                        Thread.sleep(100);
                        
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (aa){
                        System.out.println("In block 1");
                    }
                }
            }
        };
    }
    private class r1{
        private int i= 10;
        public int getI(){return i;}
        public void setI(){this.i = i;}
    }
    private class r2{
        private int i= 20;
        public int getI(){return i;}
        public void setI(){this.i = i;}
    }
}
