package Core_Java.src_onlineclass.JAN13.Polymorphism.MethodOverriding;

public class RC {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();

        Hound h = new Hound();
        h.bark();


        Dog f  =  new Hound(); // Dynamic Diaptch
        // Runtime Polymorphism
        f.bark();


        //Hound a = new Dog(); // Java 22 This is not possible
        // Latest java 22 - It is never possible in JAVA

    }
}
