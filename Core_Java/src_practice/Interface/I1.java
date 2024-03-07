package Core_Java.src_practice.Interface;

public interface I1 {
    interface a{
        String aa = "I am default0"; // Final variable within Interface
//        aa = "I am changed";
        int b = 25;
//        b = 22;
    }

    public static void main(String[] args) {
//        a A = new a();
        System.out.println(a.aa);
        System.out.println(a.b);
//        a.aa = " I am changed";  Not possible
    }
}
