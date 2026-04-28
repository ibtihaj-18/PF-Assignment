// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        // HashMap<String,String> data = new HashMap<>();
        // data.put("Ali","0310-0000111");
        // String a = data.get("Ali");
        // System.out.println(a); 
                      
        ahmedsContact.add("0315-1111000");
        ahmedsContact.add("0310-1111000");
        HashMap<String,ArrayList<String>> data = new HashMap<>();
        data.put("Ali",ahmedsContact);
        // data.put("Ahmed","0311-0011010");
        // data.put("Hamid",ahmedsContact);
        // data.put("Ali",ahmedsContact);
        ArrayList<String> a = data.get("Ali");
        System.out.println(a);
                // Set<String> names = data.keySet();
                
    }
}  