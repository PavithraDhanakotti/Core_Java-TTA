package Core_Java.src_practice;

public class Lab008 {

    // Static Keyword
    // Static and Non-Static variable

    // Static Variable
    static String a= "Static Variable";

    static {
        System.out.println("I am SIB");
    }

    {
        System.out.println("I am IIB");
    }

    //Non - Static --> 2variants
    // Local Variable
    //Instance Variable
    String b = "Non Static , Local Variable";
    void print() {
        String c = "Instance Variable";
    }
    class pav{
        String d = "Local Variable";
    }
}
