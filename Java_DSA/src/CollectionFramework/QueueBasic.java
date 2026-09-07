package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args) {
        // Code for basic queue operations will go here
        Queue<Integer> q = new LinkedList<>();
        // Deque<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);
        System.out.println("Removing: " + q.poll());
        System.out.println(q);

        System.out.println("Peeking element :" + q.peek());
    }

}