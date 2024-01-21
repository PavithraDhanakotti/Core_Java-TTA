package Core_Java.src_onlineclass.DEC09_JAVABascis;

public class Ex0002 {
    public static void main(String[] args) {

        // Keyword -> Simple English words
        // package, public, class -> Reserved words (Of Java)
        // Blue,Orange color (White mode),(Black Mode)
        // Keywords are not in lower case
        // we can't use keywords as variable

        byte age = 10; // Range for byte ( -128 to 127)
        // byte age1 = 128; // out of range
        age = 127;
        System.out.println(age);

        // Interview Question --> What will it print?
        System.out.println(age+1); //128
        // age = age +1; // Error occurs it will not store
        System.out.println(age);

        // Local Variable - age
        // Means is available within the main void/function

        short age2 = 128; // Range for Short (-32768 to 32767)
        short $ = 123; // Will it print? ---> Yes

    }
}
