package Core_Java.src_practice;

public class Lab0002 {
    public static void main(String[] args) {
        Lab0001 lab = new Lab0001() ;
        lab.print();

        System.out.println("_______________________________");

        Lab0001 lab2 = new Lab0001("Prapthi", "Female");
        lab2.Name = "Hello";
        lab2.print();


    }
}
