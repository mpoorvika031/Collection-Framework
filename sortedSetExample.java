import java.util.SortedSet;
import java.util.TreeSet;
public class sortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("apple");
        sortedSet.add("banana");
        sortedSet.add("cherry");
        System.out.println(sortedSet);

        System.out.println("Contains 'banana': " + sortedSet.contains("banana"));

        System.out.println("First element: " + sortedSet.first());
        System.out.println("Last element: " + sortedSet.last());

        sortedSet.remove("banana");
        System.out.print("After removing banana:");
        System.out.println(sortedSet);
        System.out.println("Size of the sorted set: " + sortedSet.size());
    }
    
}
