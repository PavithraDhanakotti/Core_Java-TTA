package Core_Java.src_onlineclass.JAN_07_INHERITANCE_OOPS;

public class ATBPerson {
        String name; // instance  variable values are default
        long phone;
        String email;
        boolean isMarried;
        String courseName;

        // Default Constructor
        ATBPerson(){
            courseName = "ATB";
            System.out.println("I am Default!");
        }

        // Param Constructor
        ATBPerson(String valuefromObjectRef){
            this.name = valuefromObjectRef;
        }

        void talk(){
            System.out.println(" Talk!!");
        }

        void printDetails(){
            System.out.println(this.name);
            System.out.println(courseName);

        }
}
