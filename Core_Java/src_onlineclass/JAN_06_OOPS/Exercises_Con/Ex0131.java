package Core_Java.src_onlineclass.JAN_06_OOPS.Exercises_Con;

public class Ex0131 {
    public static void main(String[] args) {
        String name = "Pavithra";
        System.out.println(name.concat(" D"));
        System.out.println(name + " D");
        System.out.println(name.contains("a"));
        System.out.println(name);


        String name2 = new String("D");


        String expected_result = "password@123";
        String actual_result  = "Password@123";
        if(expected_result.equalsIgnoreCase(actual_result)){
            System.out.println("Yes");
        }
    }
}
