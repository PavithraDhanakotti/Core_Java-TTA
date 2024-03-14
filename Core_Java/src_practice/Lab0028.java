package Core_Java.src_practice;

import java.util.Comparator;

public class Lab0028 {
    // Compare -> 2 ways

    // Compare - Just can sort by either Id or name
    // Comparetor - Can do both sort by id and name

    public Integer Id;
    public String Name;
    public Integer Age;

    class SortbyId implements Comparator<Lab0028>{

        @Override
        public int compare(Lab0028 o1, Lab0028 o2) {
            return 0;
        }
    }


}
