package src_onlineclass.DEC23_LOOPandCONDITION;

public class Ex0079 {
    public static void main(String[] args) {
// for( A ;B ; C)
        // A -> Initialization -> JVM What variable, where you are starting point
        // B - Condition -> When you want this to stop. -> true, false
        // C ->  Increment / Decrement

        System.out.println("Print the value of i, but I want to break when i = 5");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Val of "+ i);
            if( i ==5){
                break;
            }
            // System.out.println("Val of "+ i);
        }

        System.out.println("End");

    }
}
