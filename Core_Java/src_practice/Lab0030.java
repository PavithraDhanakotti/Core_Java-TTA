package Core_Java.src_practice;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;


public class Lab0030 {
    public static void main(String[] args) {
        // Map -> Interface
        // A Key :: Value pair
        //Can't contain duplicates Keys

        //can convert map -> Json and vise versa using third party Lib

        Map map = new HashMap();
        map.put("Name", "Pavithra");
        map.put("Name", "PALLAVITHRA");

        Map<Integer,String> map1 =new HashMap();
        map1.put(1,"Pavithra");
        map1.put(1,"Pavvithra"); // Even if we write duplicate keys it takes the update values
        map1.put(2,"Pavithra");
        map1.put(3,"Pavithra");
        System.out.println(map1);
        map1.put(-9,"Pavithra");
        map1.put(null,"Pavithra");
        System.out.println(map1);
        System.out.println(map1.get(2));


//        To execute
//        Here in case of map we use Entryset()

        for (Map.Entry<Integer,String> e : map1.entrySet()){
            System.out.println(e.getKey() + "  =  "+ e.getValue());
        }

        //Other way to execute entryset
        Set a = map1.entrySet();
        System.out.println(a);


    }
}
