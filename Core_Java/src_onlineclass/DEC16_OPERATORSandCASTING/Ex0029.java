package Core_Java.src_onlineclass.DEC16_OPERATORSandCASTING;

public class Ex0029 {
    public static void main(String[] args) {

        String s1= "Pavithra";
        // String Constant pool = SCP / String Pool

        // New Operator - Object
        String s2 = new String ("Pavithra");
        // New operator is used to create the new object for class.
        // It returns of the address of newly created object.
        System.out.println(s2);
        System.out.println(new String("Pavithra") );
    }
}
