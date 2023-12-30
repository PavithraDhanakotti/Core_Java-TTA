package src_onlineclass.DEC30;

public class Ex0112 {
    public static void main(String[] args) {

    int a =120;
    int b = 20;
    int c = a-b;
    System.out.println(c);

    a =34;
    b=45;
    int d = a-b;
    System.out.println(d);

    int e = Pavi_sum(3,4);
    System.out.println(c);
    }

     int sum(int a, int b){
        return a+b;
     }

      static int Pavi_sum (int input_1, int input_2){
        return input_1+input_2;
    }

    static int Pavi_sum (int input_1) {
        return input_1;
    }

    static int Pavi_sum(){
        return 99;
    }

    static int Pavi_sum (int input_1, int input_2, int c){
        return input_1+input_2+c;
    }

}
