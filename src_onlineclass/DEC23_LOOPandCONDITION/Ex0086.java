package src_onlineclass.DEC23_LOOPandCONDITION;

public class Ex0086 {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            if (i % 2 == 0) {
                System.out.println("Value 1 of i  "+i);
                continue;
            }
            System.out.println("Value of 2  " +i);
        }
    }
}
