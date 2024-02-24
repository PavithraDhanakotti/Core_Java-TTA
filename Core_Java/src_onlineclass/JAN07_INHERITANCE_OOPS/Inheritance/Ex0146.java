package Core_Java.src_onlineclass.JAN07_INHERITANCE_OOPS.Inheritance;

public class Ex0146 {
    public static void main(String[] args) {
        // ## What is Inheritance?
        // Inheritance provides a way to create a new class from an existing class
        // SuperClass | Parent Class | Base Class
        // SubClass | Child Class | Derived Class
        // The extends Keyword

        // SubClass extends SuperClass{
        ////contents of SubClass
        //}


        programming p = new programming(); // Parent Class/ SuperClass / Base Class
        // How JVM understand this program

        // Programming - Class
        // p ->  ref to the Object
        // new Programming() ->  Object
        // DC is called

        p.printInfo();

        programming p2 = new programming("Perl",12);
        // How JVM understand this program

        // Programming - Class - Class Loader
        // p2 ->  ref to the Object
        // new Programming() ->  Object
        // Param - Constructor - Called!!


        p2.printInfo();

    }
}
