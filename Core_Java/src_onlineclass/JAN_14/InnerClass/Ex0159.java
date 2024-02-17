package Core_Java.src_onlineclass.JAN_14.InnerClass;

public class Ex0159 {
    public static void main(String[] args) {


        Car c = new Car("Lambo 137");

        Car.Engine engine = c.new Engine("400CC");
        engine.start();
        c.drive();

        // OC.IC ref = OCRef.new IC();


    }






}


class Car{
    String make; // Instance Variables

    // Parameterimized Constructor
    public Car(String make) {
        this.make = make;
    }

    // Method
    void drive(){
        System.out.println("You can driver Car");
    }


    public class Engine{

        // Instance Variables
        String hoursePower;

        // Parameterimized Construct
        public Engine(String hoursePower) {
            this.hoursePower = hoursePower;
        }

        // Method
        void start(){
            System.out.println("Enginer is started!! -> " + make);
        }




    }



}
