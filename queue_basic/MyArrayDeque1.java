// package queue_basic;
import java.util.ArrayDeque;
import java.util.Queue;
public class MyArrayDeque1 {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println("Queue: " + q);
        System.out.println("Removed element: " + q.poll());
        System.out.println("Queue after removal: " + q);
        System.out.println("Head of the queue: " + q.peek());
      }
}
