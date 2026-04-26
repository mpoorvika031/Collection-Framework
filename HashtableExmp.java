//Legacyclasses are the classes which are present in the java before the introduction of collection framework. These classes are not synchronized and they are not thread safe. They are not recommended to be used in the new code. Some of the legacy classes are Vector, Hashtable, Stack, etc.

import java.util.Hashtable;
public class HashtableExmp {
    public static void main(String[] args) {
        //LEGACY CLASS
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "Raj");
        ht.put(2, "Kumar");
        ht.put(3, "Krish");
        System.out.println("Before updating the hashtable : "+ht);

        ht.put(2, "Poorvika");
        ht.put(3, "Anvitha");   
        System.out.println("After updating the hashtable : "+ht);

        System.out.println("Value for key 2 : "+ht.get(2));

        System.out.println("Size of the hashtable : "+ht.size());

        System.out.println("Is the hashtable empty? : "+ht.isEmpty());

        System.out.println("Does the hashtable contain key 1? : "+ht.containsKey(1));
    }
}