package Core_Java.src_onlineclass.JAN_14.Interview;

public class I1 {
    public static void main(String[] args) {
        System.out.println(H.a);
        Pavithra p = new Pavithra();
        p.m1();
    }
}


interface H{
    // Only Static variables

    int a =10;
    public static final int b = 20;
    public static final int c  =99;
    void m1(); // This is non static
}

class Pavithra implements H{

    @Override
    public void m1() {

    }
}
