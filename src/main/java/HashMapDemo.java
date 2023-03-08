import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> age = new HashMap<>();
        age.put("El", 33);
        age.put("El1", 32);
        age.put("El2", 35);
        System.out.println(age.get("El"));
        System.out.println(age.keySet());
        System.out.println(age.values());
        System.out.println(age.entrySet());

        age.replace("El", 40);
        System.out.println(age);

        Iterator iterator = age.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println("Entry set: " + iterator.next());
        }

        System.out.println("*********");

        Iterator<Map.Entry<String, Integer>> iterator2 = age.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, Integer> entry = iterator2.next();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }

    }
}
