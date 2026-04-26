//LEGACY CLASS

import java.util.Stack;
public class stackexmp {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Stack elements: " + s);

        System.out.println("Size of the stack: " + s.size());

        System.out.println("Top element of the stack: " + s.peek());

        s.pop();
        System.out.println("Stack after popping the top element: " + s);

        System.out.println("Is the stack empty? " + s.isEmpty());
    }
    
}
