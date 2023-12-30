package src_onlineclass.DEC16_OPERATORSandCASTING;

public class Ex0027 {
    public static void main(String[] args) {
        // Casting - Mold
        // Widening is the process of converting lower type to higher type
        byte b=10;
        // int a=b; // Implicit casting - Done By JVM
        int a = (int)b; // Explicit Casting - JVM


        //Narrowing is the process of converting of higher type to lower type
        int a1=300;
        // byte b1=a1; // Invalid - Implicit Casting
        byte b1 = (byte) a1; // Explicit Casting
        System.out.println(b1); //Answer is 44 Why?

        // 32 bits
        // 00000000000000000000000100101100
        // Only last 8 part will be stores int to b
        //00101100
        // 0*27+0*26+1*25+0*24+1*23+1*22+0*21+0*20
        // 0+0+32+0+8+4+0+0 = 44


    }
}
