package Core_Java.src_practice.Interface;

public class Interface2 {
    public static void main(String[] args) {
        Station sta = new Station();
        sta.police();
        sta.police1();

//        face cops = new face()
        face cops = new Station();
        cops.police1();

    }
}

interface face{
    void police();

    default void police1(){
        System.out.println("I am the Police"); // to display this method we have comment or earse the override of this method in class
    }
}

class Station implements face{

    @Override
    public void police() {
        System.out.println("I am default Police");
    }

//    @Override
//    public void police1() {
//        System.out.println("I am subsidiary police");
//    }
}