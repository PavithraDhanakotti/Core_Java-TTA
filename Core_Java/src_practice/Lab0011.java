package Core_Java.src_practice;

public class Lab0011 {
    //Wrapper Class
    static int a = 10; //Normal primitive data type
    // In wrapper it same but it has extra funtionality just they have Upper capital letter in full form

    static Integer b =11; // Wrapper class
    // other extra function is that it can convert from primitive to wrapper and vise versa

    static int aa = Integer.valueOf(b);
    static Integer bb = a;


    public static void main(String[] args) {
        System.out.println(aa);

    }
}
