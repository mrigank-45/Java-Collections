import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>();  // min heap by default.
        // Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  // max heap.

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);
        pq.poll();  // removes the head of the queue.
        System.out.println(pq);

        System.out.println(pq.peek()); // returns the head of the queue.

    }

}
