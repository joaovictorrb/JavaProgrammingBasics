package course.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {
        // FIFO
        // LinkedList and PriorityQueue
        Queue<String> q = new LinkedList<>();
        q.add("Apple");
        q.add("Orange");
        q.add("Banana");
        q.add("Grape");
        // q.remove();
        // q.poll(); // Works with empty queue
        System.out.println(q);
        System.out.println(q.peek());
        for (String f: q) {
            System.out.println(f);
        }

        System.out.println();

        Queue<String> pq = new PriorityQueue<>();
        pq.add("Grape");
        pq.add("Apple");
        pq.add("Orange");
        pq.add("Banana");
        System.out.println(pq);
    }

}
