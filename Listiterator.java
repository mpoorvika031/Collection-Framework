import java.util.*;

public class Listiterator {
    public static void main(String[] args) {
       LinkedList<String> l = new LinkedList<>();
         l.add("Raj");
         l.add("Kumar");
         l.add("Krish");
         l.add("John");
        System.out.println("Before updating the list : "+l);

        ListIterator<String> itr = l.listIterator();
        while(itr.hasNext()) {
            String s = (String)itr.next();
            if(s.equals("Raj")) {
                itr.remove();
            }
            else if(s.equals("Kumar")) {
                itr.add("Poorvika");
            }
             else if(s.equals("Krish")) {
                itr.set("Anvitha");
            }
        }
        System.out.println("After updating the list : "+l);
        
    }
}
