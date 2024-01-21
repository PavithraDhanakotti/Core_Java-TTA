package Core_Java.src_onlineclass.JAN_07.Inheritance.Heirarchical;

public class Vehicle {

    Vehicle(){
        System.out.println("DC Vehicle");
    }

    void vehicleHasTopSpeed(){
        System.out.println("Yeah from "+getClass().getSimpleName());
    }
}