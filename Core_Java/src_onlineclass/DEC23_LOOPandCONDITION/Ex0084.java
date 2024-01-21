package Core_Java.src_onlineclass.DEC23_LOOPandCONDITION;

public class Ex0084 {
    public static void main(String[] args) {
        //int a = 10;
        //if ( a == 10 ) { break;
        //}

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i%2 == 0){
                break;
            }
        }
    }
}
