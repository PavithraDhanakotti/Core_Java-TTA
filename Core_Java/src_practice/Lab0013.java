package Core_Java.src_practice;

public class Lab0013 {

    // Generic
    public static void main(String[] args) {
        System.out.println(maxiandmin(21,56,99));
        System.out.println(maxiandmin("A","Z","C"));

    }

    public static <DT extends Comparable <DT>> DT maxiandmin(DT a, DT b, DT c){
        DT max =a ;
        if ( b.compareTo(max)>0){
            max=b;
        }
        if (c.compareTo(max)>0){
            max=c;
        }
        return max;
    }
}
