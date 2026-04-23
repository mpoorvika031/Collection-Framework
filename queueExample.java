
import java.util.LinkedList;
import java.util.Queue;
public class queueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");
        System.out.println(queue);
        queue.offer("mango");
        System.out.println(queue);

        System.out.println("Peek: " + queue.peek());

        System.out.println("Poll: " + queue.poll());
        System.out.println(queue);

        queue.remove();
        System.out.println("REMOVED:"+queue);

    }
}
