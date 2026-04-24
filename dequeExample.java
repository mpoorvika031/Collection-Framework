public class dequeExample {
    public static void main(String[] args) {
        java.util.Deque<String> deque = new java.util.LinkedList<>();
        deque.add("apple");
        deque.add("banana");
        deque.add("cherry");
        System.out.println(deque);

        deque.offerFirst("mango");
        System.out.println(deque);

        deque.offerLast("grape");
        System.out.println(deque);

        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());

        System.out.println("Poll First: " + deque.pollFirst());
        System.out.println("Poll Last: " + deque.pollLast());
        System.out.println(deque);

        deque.removeFirst();
        System.out.println("REMOVED FIRST:"+deque);

        deque.removeLast();
        System.out.println("REMOVED LAST:"+deque);

        System.out.println("FIRST ELEMENT:"+deque.getFirst());
        System.out.println("LAST ELEMENT:"+deque.getLast());
    }
}
