package Core_Java.src_onlineclass.DEC24_ARRAY;

public class Ex0110 {
    public static void main(String[] args) {


        // 1D
        int[] l = {1,2,3}; //-> Hori

        // 2D
        int[][] arr = new int [3][3];
        int[][] arr2 = new int [3][3];
        // |1,2,3|
        // |4,5,6|
        // |7,8,9|
        arr [0][0] = 12;
        arr [0][1] = 34;
        arr [0][2] = 34;

        arr [1][0] = 100;
        arr [1][1] = 98;
        arr [1][2] = 45;

        arr [2][0] = 1;
        arr [2][1] = 43;
        arr [2][2] = 45;

        for (int i = 0; i < l.length; i++) {
            for (int j=0; j< arr[i].length; j++){
                System.out.println(arr[i][j]+ "\t");
            }
            System.out.println(" ");
        }
    }
}
