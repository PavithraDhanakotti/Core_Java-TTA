package Core_Java.src_practice;

public class Lab001 {

    // Class

    String Name;
    int Age;
    long Phone;
    String Gender;
    boolean IsMarried;

// DEFAULT CONSTRUCTOR --> Does't change values

    // This will execute when have mentioned the attributes or not(if we want to exe it we have to create a usage for it)
    // and used void name under main method of different class with or without creation of new object but will
    // not mention any of print details we have mentioned, unless we have to create a new object.
   Lab001(){
       //Name = "PAVITHRA";
       Name = "PAVITHRA";
        System.out.println("I am Called! with creation of a new object");
    }

// PARAMETER CONSTRUCTOR --> Change values
Lab001(String valuefromObjectRef){
       this.Name=valuefromObjectRef;
    System.out.println("I am also Called!");
}

void print(){
    System.out.println(Name);
}
}
