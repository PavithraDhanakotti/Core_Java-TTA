package Core_Java.src_onlineclass.JAN_06.Exercises_Con;

public class Ex0134 {
    public static void main(String[] args) {
// Immutable in nature (that can't changed)
        String password = "pass@123";

        // 1000 times I am going to change the password value
        // should I use the Sb, sb OR String

        // Mutable - that can be changed!!
        StringBuilder password2 = new StringBuilder("Pavithra");
        password2.append(" D");
        System.out.println(password2);

    }
}
