package CollectionFramework;

import java.util.Queue;
import java.util.PriorityQueue;

public class Priorityqueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        // default behaviour ->Integeers ->less value -> high priority ->minHeap
        // maxHeap -> Integers -> high value -> high priority
        //pq ->strings -> comparator
        pq.offer(283);
        pq.offer(24);
        pq.offer(156);
        pq.offer(670);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());

    }
}
