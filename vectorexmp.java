//LEGACY CLASS

import java.util.Vector;
public class vectorexmp {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        System.out.println("Vector elements: " + v);

        System.out.println("Size of the vector: " + v.size());

        System.out.println("Element at index 1: " + v.get(1));

        v.remove(0);
        System.out.println("Vector after removing element at index 0: " + v);

        System.out.println("Is the vector empty? " + v.isEmpty());
    }
    
}
