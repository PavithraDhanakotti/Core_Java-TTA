package Core_Java.src_onlineclass.JAN_06.Exercises_Con;

public class Ex0133 {
    public static void main(String[] args) {
// Immutable in nature (that can't changed)
        String s1 = "Pavithra";
        String s2 = new String("Pavithra");


        // Mutable - that can be changed!!

//        StringBuffer sbuf4 = new StringBuffer("Pavithra");


        StringBuilder sb3 = new StringBuilder("Pavithra");
        sb3.append(" D");
        System.out.println(sb3);


        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);

    }
}
