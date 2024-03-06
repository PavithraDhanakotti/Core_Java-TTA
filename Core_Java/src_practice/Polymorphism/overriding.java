package Core_Java.src_practice.Polymorphism;

public class overriding {


    static class Gender {

        void Male() {
            System.out.println("I am male");
        }
        void Female1(){
            System.out.println("I am female");
        }

    }

    static class female extends Gender{
          void Female2(){
            System.out.println("I am also female");
        }
    }

}
