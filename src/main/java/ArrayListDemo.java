import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <String> ourList = new ArrayList<>();

        ourList.add("Name");
        System.out.println(ourList);
        ourList.add("Surname");
        System.out.println(ourList);
        ourList.add("Birth date");
        System.out.println(ourList);

        System.out.println(ourList.get(0));
        ourList.set(0, "First Name");
        System.out.println(ourList.get(0));

        ourList.remove(0);
        System.out.println(ourList.get(0));

        Iterator<String> iterator = ourList.iterator();
        String name = iterator.next();
        System.out.println(name);
    }
}
