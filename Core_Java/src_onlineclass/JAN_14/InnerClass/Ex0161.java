package Core_Java.src_onlineclass.JAN_14.InnerClass;

public class Ex0161 {
    public static void main(String[] args) {


        Pavithra.Ipad pi = new Pavithra.Ipad();
        pi.eating();



    }
}

// Class Members
class Pavithra{
    int age  = 31; // Data Memebers / Instances Variables

    // Methods
    void eay(){
        System.out.println("I am eating");
    }

    static class Ipad{
        void eating(){
            System.out.println("I am IPAD");
            //System.out.println(age);
        }
    }



}