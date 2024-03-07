package Core_Java.src_practice.Interface;


public class Bank implements PubBank, PriBank{

    void Govbank(){
        System.out.println("I am Government bank");
       Public();
       Private();
    }

    @Override
    public void Public() {
        System.out.println("I am Public Bank");
    }

    @Override
    public void Private() {
        System.out.println("I am Private Bank");
    }
}
