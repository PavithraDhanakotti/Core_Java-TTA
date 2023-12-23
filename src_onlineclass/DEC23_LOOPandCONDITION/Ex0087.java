package src_onlineclass.DEC23_LOOPandCONDITION;

public class Ex0087 {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            if (i % 2 == 0) {
                System.out.println("Value of Even Number  "+i);
                continue;
            }
            System.out.println("Value of Odd number  " +i);
        }
    }
}
