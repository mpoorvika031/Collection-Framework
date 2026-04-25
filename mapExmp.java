import java.util.*;
public class mapExmp {
    public static void main(String[] args) {

        Map<Integer, String> m = new HashMap<>();
        m.put(1, "Raj");
        m.put(2, "Kumar");
        m.put(3, "Krish");
        System.out.println("Before updating the map : "+m);

        m.put(2, "Poorvika");
        m.put(3, "Anvitha");   
        System.out.println("After updating the map : "+m);

        System.out.println("Value for key 2 : "+m.get(2));

        System.out.println("Size of the map : "+m.size());

        System.out.println("Is the map empty? : "+m.isEmpty());

        System.out.println("Does the map contain key 1? : "+m.containsKey(1));
    }
}
