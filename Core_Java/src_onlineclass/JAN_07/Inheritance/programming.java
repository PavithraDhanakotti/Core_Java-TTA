package Core_Java.src_onlineclass.JAN_07.Inheritance;

public class programming {
    int version;
    String author;

    programming(){
        System.out.println("Program - DC");
    }

    programming(String author, int version){
        this.author = author;
        this.version = version;
    }

    void printInfo(){
        System.out.println(" Program Info ->  "+ this.version + " Author " + this.author);
    }

    void car(){
        System.out.println("Lambo");
    }

    void bhk3(){
        System.out.println("3BHK");
    }

}
