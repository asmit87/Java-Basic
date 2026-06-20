import java.util.ArrayDeque;
import java.util.Deque;


public class MyArrayDeque {
    public static void main(String[] args) {
        // array deque implementation of deque/queue
        // Deque<Integer> q = new ArrayDeque<>();
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offerFirst(20);
        q.offerLast(30);
        System.out.println("Deque: " + q);
        q.pollFirst();
        System.out.println("Deque after removing first element: " + q);
        q.pollLast();
        System.out.println("Deque after removing last element: " + q);
        System.out.println(q.size());
        q.offer(40);
        q.offer(50);
        System.out.println(q);
        System.out.println("Head of the deque: " + q.peekFirst());
        System.out.println("Tail of the deque: " + q.peekLast());
        System.out.println(q.peek());
          }
       }
        