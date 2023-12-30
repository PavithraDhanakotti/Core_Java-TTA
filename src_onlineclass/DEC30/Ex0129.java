package src_onlineclass.DEC30;

public class Ex0129 {
    public static void main(String[] args) {

        String name = "Pacithra";
        String e = "  ";

        for (int i =name.length()-1; i>=0; i++){
            e= e + name.charAt(i);
        }
        System.out.println(e);
    }
}
