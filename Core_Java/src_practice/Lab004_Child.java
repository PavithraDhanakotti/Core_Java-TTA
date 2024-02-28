package Core_Java.src_practice;

public class Lab004_Child extends Lab003{
String ChildHouse;
String ChildCar;
int ChildMoney;
    void ChildHouse(){
        System.out.println("Child House");
    }

    void ChildCar(){
        System.out.println("Child Car");
    }

    void ChildMoney(){
        System.out.println("Chile Money");
    }
Lab004_Child(String C_House, String C_Car, int C_Money){
        this.ChildHouse = C_House;
        this.ChildCar = C_Car;
        this.ChildMoney = C_Money;

}

void child_inheri(){
        System.out.println(this.ChildCar);
        System.out.println(this.ChildHouse);
        System.out.println(this.ChildMoney);

    }
    public static void main(String[] args) {
        Lab004_Child lab = new Lab004_Child("2BHK","Lambo",1234);
        lab.ChildCar();
        System.out.println(lab);
        System.out.println("______________________");
        lab.child_inheri();
    }
}
