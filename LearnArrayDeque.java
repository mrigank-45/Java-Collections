import java.util.ArrayDeque;

public class LearnArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offerFirst(12);
        adq.offerLast(45);  
        adq.offerLast(75);  

        System.out.println(adq);

        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() " +adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast() " +adq);

    }

}
