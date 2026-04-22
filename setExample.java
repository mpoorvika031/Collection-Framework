import java.util.*;
public class setExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        System.out.println(set);

        System.out.println("Contains 'banana': " + set.contains("banana"));

        set.remove("banana");
        System.out.println("After removing banana:");
        System.out.println(set);
        System.out.println("Size of the set: " + set.size());
    }
}