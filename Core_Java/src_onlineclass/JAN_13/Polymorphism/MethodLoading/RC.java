package Core_Java.src_onlineclass.JAN_13.Polymorphism.MethodLoading;

public class RC {
    public static void main(String[] args) {

        // Method Overloading
        // Load -> same name different
        new Person().Gift(1);
        new Person().Gift("pavithra");
        new Person().Gift(3.14);

    }
}
