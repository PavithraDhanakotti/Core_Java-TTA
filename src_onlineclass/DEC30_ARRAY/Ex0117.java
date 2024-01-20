package src_onlineclass.DEC30_ARRAY;

public class Ex0117 {
    public static void main(String[] args) {
// Interview
        System.out.println(" Run fine!!");
        int d = main (10);
        System.out.println(d);

        main ("Pavithra"); // will match with data type
    }
    static void main(String s){ // to call the function use static
        System.out.println("I am a Main Function but JVM doesn't recognize me");
    }

     static int main (int a){
        return a +10;
    }
}
