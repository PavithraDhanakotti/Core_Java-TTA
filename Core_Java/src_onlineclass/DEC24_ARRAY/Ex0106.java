package Core_Java.src_onlineclass.DEC24_ARRAY;

public class Ex0106 {
    public static void main(String[] args) {

        int [] marks = new int [4];
        marks[0] = 98;
        marks[1] = 99;
        marks[2] = 100;
        marks[3] = 101;

        // 1D -> [ -> ]
        // 2D -> Row and Colum
        // 3D
        // 4D

        int i =0;
        while (i < marks.length) {
            System.out.println(marks[i]);
            i++;
        }
        System.out.println(" END");
    }
}
