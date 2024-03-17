package Core_Java.src_practice;

public class Lab0009 extends sub {
    public static void main(String[] args) {
        sub lab = new sub();
        lab.print1();
        lab.print2();
        lab.IIB();
        SIB();


    }
}

class sub{

    int a =55;
    static int b =63;

    static void SIB(){
        System.out.println("I am SIB");
//        System.out.println("I am SIB");
    }
    void IIB(){
        System.out.println("I am IIB");
    }

    void print1(){
        System.out.println(a);
        System.out.println(b);
    }
    static void print2(){
//        System.out.println(a);
        System.out.println(b);
//        SIB();
//        SIB();
    }
}
