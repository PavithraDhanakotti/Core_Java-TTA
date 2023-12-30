package src_onlineclass.DEC10_DATATYPESandVARIABLES;

public class Ex0008 {
    public static void main(String[] args) {
        int number = 9;
        System.out.printf("%d*1=%d*1", number,2);
        System.out.printf("%d*2=%d*2", number,3);
        System.out.printf("%d*3=%d*3", number,4);
        System.out.printf("%d*4=%d*4", number,5);

        String name = "Pavithra"; // string is a bunch of char
        System.out.println("My name is "+ name); // + -> is called concatenation
        System.out.printf("My name is %s",name);

        //%f ->float
        float pi = 3.14159f;
        System.out.printf("Pi value is %f", pi);
    }
}
