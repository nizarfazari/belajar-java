package java_collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;


/*
    FIFO first in first out
*   ArrayDeque || LinkedList || PriorityQueue
*   Array deque menggunakan array sebagai implementasinya
*   LinkedList menggunakan double linked list sebgai implementasi queue
*   PriorityQueue menggunakan Array sbg implementasi namaun di urutkan dengan Comparable atau Comparator
* */
public class QueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        Queue<String> priorQueue = new PriorityQueue<>();

        queue.add("Nizr");
        queue.add("Fazari");
        queue.add("Budi");

        for (String next = queue.poll();next != null; next = queue.poll()){
            System.out.println(next);
        }

        System.out.println(queue.size());


    }
}
