package Core_Java.src_practice;


import Core_Java.src_onlineclass.JAN13.Encapsulation.Student;

public class Lab0010 {

    abstract class ok {

    }

    ; // Normal abstract class

    interface notok {

        void okok();
    } // Normal interface class

//    But we can't create an object for abstract and interface whereas we can by using anonymous class
//HOW?

    public static void main(String[] args) {
    Student ok = new Student() {

        // This is anonymous class
//    here only reference is used to call not the object
    };
}
}

