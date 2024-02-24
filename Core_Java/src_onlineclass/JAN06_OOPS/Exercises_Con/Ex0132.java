package Core_Java.src_onlineclass.JAN06_OOPS.Exercises_Con;

public class Ex0132 {
    public static void main(String[] args) {

        // INTERVIEW QUESTION
        String s1 = "Pavithra";
        String s2 = new String("Pavithra");
        String s3 = new String("pavithra");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
