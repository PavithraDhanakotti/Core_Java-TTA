package Core_Java.src_onlineclass.JAN07_INHERITANCE_OOPS.Inheritance;

public class Java extends programming {
    String newFeature;

    Java() {
        System.out.println("Java DC");
    }

    Java(String feature) {
        this.newFeature = feature;
    }

    void printInfo() {
        System.out.println("Feature is -> " + this.newFeature);
        System.out.println("Feature is -> " + this.newFeature);
    }

//    int version;
//    String author;

//    Programming(){
//        System.out.println("DC");
//    }
//
//    Programming(String author, int version){
//        this.author = author;
//        this.version = version;
//    }
//
//    void printInfo(){
//        System.out.println(" Program Info ->  "+ this.version + " Author " + this.author);
//
//    }
}