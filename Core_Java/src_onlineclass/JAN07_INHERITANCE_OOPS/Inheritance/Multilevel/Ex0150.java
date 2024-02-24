package Core_Java.src_onlineclass.JAN07_INHERITANCE_OOPS.Inheritance.Multilevel;

public class Ex0150 {
    public static void main(String[] args) {
//        GrandFather g = new GrandFather();
//        Father f = new Father();
//        Son s = new Son();
//
//
//        GrandFather g = new Son();
//
//
//        Father f = new Son();
//        // Son s  = new GrandFather();
//        // Son s = new Father();
//        Son s = new Son();

        GrandFather g = new Son();
        g.bhk3();

        Son s = new Son();
        s.bhk1();
        s.bhk2();
        s.bhk3();



    }
}
