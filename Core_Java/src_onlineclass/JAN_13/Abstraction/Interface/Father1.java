package Core_Java.src_onlineclass.JAN_13.Abstraction.Interface;

interface Father1 {
    void load1K();

    default void print(){
        System.out.println("I am default method");
    }

    static void print2(){
        System.out.println("I am static METHOd!");
    }
}
