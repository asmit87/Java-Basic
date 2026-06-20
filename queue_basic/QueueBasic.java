// package queue_basic;
import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    public static void main (String[] args){
        // linked list implementation of queue
        Queue <Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println("Queue: " + q);
        System.out.println("Removed element: " + q.poll());
        System.out.println("Queue after removal: " + q);
        System.out.println("Head of the queue: " + q.peek());
    }
    
}
