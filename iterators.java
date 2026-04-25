import java.util.*;

public class iterators {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            l.add(i);
        }
        System.out.println("Before removing odd numbers : "+l);
        Iterator<Integer> itr = l.iterator();
        System.out.println("Even numbers are : ");
        while(itr.hasNext()) {
            Integer I = (Integer)itr.next();
            
            if(I%2 == 0) {
                System.out.println(I);
            }
            else {
                itr.remove();
            }
        }

       System.out.println("After removing odd numbers : "+l);
        System.out.println(l);
    }
}