package Core_Java.src_onlineclass.DEC30_ARRAY;

public class Ex0125 {
    public static void main(String[] args) {

//        interview
        int [][] array_2d = new int [3][3];
        array_2d[0][0] =1;
        array_2d[0][1] =2;
        array_2d[0][2] =3;
        array_2d[1][0] =4;
        array_2d[1][1] =5;
        array_2d[1][2] =6;
        array_2d[2][0] =7;
        array_2d[2][1] =8;
        array_2d[2][2] =9;
//        |1, 2, 3,|
//        |4, 5, 6 |
//        |7, 8, 9 |
//        // i= j


        for (int i=0; i < array_2d.length; i++){
            for( int j=0; j< array_2d[i].length; j++){
                if (i==j){
                    System.out.println(array_2d[i][i]);
                }else {
                    array_2d[i][j] = 0;
                    System.out.print(" " + array_2d[i][j]);

                }
            }
        }

        //        array_2d[0][0] -> 1
//        array_2d[1][1]  -> 5
//        array_2d[2][3] -> 9


//        for (int i=0; i < array_2d.length; i++){
//            System.out.println(array_2d[i][i]);
//        }

    }
}
