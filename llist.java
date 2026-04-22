
import java.util.*;
public class llist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");     
        list.add("cherry");
        System.out.println(list);

        System.out.println("First element: " + list.get(0));

        list.remove("banana");
        System.out.println("After removing banana:");
        System.out.println(list);
        System.out.println("Size of the list: " + list.size());
    }
}