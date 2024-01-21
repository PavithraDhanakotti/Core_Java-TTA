package Core_Java.src_onlineclass.JAN_06_OOPS.Exercises_Con;

public class Ex0130 {
    public static void main(String[] args) {
        String name = "Pavithra"; // String constant Pool
        String name2 = new String("Pavithra"); // Heap area

        name = "D";

        String str1 = "Hello";
        str1  = str1.concat("Pavithra");
        System.out.println(str1);
    }
}
