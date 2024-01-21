package Core_Java.src_onlineclass.JAN_06_OOPS.Exercises_Con;

public class Ex0136 {
    public static void main(String[] args) {
// If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Pavithra");
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
