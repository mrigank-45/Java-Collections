import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll()); // removes the head of the queue and returns it.

        System.out.println(queue);

        System.out.println(queue.peek());  // returns the head of the queue.

    }
}
