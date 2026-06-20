// package queue_basic;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyPriorityqueue {
    public static void main(String[] args) {
        // priority queue implementation
    //    Queue <Integer> pq = new PriorityQueue<>();
        // Default behavior - less values have higher priority (min-heap)
        // pq.offer(30);
        // pq.offer(10);
        // pq.offer(20);
        // pq.offer(5);
        // System.out.println("Priority Queue: " + pq);
        // System.out.println("Removed element: " + pq.poll());
        // System.out.println("Priority Queue after removal: " + pq);
        // System.out.println(pq.poll());
        // System.out.println("Priority Queue after second removal: " + pq);
        // max-heap behavior -higher values have higher priority
        Queue <Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        // Default behavior - higher values have higher priority (max-heap)
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        pq.offer(5);
        System.out.println("Priority Queue: " + pq);
        System.out.println("Removed element: " + pq.poll());
        System.out.println("Priority Queue after removal: " + pq);
        System.out.println(pq.poll());
        System.out.println("Priority Queue after second removal: " + pq);
        
    }
}
