package Core_Java.src_practice.AccessModifiers;

public class Doctor {

    public String Pills;
    public long Howmuch;

    public Doctor(String pills,long howmuch ){
    this.Pills = pills;
    this.Howmuch = howmuch;
    }

    protected void Access(){
        System.out.println("You can access the pills");
    }
}
