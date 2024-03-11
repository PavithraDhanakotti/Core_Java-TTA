package Core_Java.src_practice;

public class Lab0012 {
    public static void main(String[] args) {
        int maxi = maxandmin(25,63,94);
        System.out.println(maxi);
    }
    // Generic
    // Allows re-usability of the code in different data types of variable.

    //Non-Generic

    public static int maxandmin(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
    return max;
    }
}


