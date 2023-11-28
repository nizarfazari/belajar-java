package java_collections;

import java.util.Deque;
import java.util.LinkedList;


/*
*   Di dalam deque bisa  mengimplementasikan FIFO dan LIFO
* */
public class DequeApp {
    public static void main(String[] args) {

        // Stack LIFO
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Nizar");
        stack.offerLast("Fazari");
        stack.offerLast("Test");

//        for (var value : deque){
//            System.out.println(value);
//        }

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());


        // Antrian FIFO
        Deque<String> queue = new LinkedList<>();

        queue.offerLast("Nizar");
        queue.offerLast("Fazari");
        queue.offerLast("Test");


        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}
