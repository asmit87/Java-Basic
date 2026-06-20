// package queue_basic;
import java.util.HashSet;
import java.util.Set;
public class Hashset1 {
    public static void main(String[] args) {
        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();
        hs1.add(10);
        hs1.add(20);    
        hs1.add(30);
        hs1.add(40);
        hs2.add(30);
        hs2.add(40);    
        hs2.add(50);
        hs2.add(60);
        System.out.println("HashSet 1: " + hs1);
        hs1.retainAll(hs2); 
        System.out.println("HashSet 1 after retainAll: " + hs1);
        System.out.println("HashSet 2: " + hs2);
        System.out.println( hs2.containsAll(hs1));

        // HashSet implementation
    //      Set<Integer> hs = new HashSet<>();   
    //     hs.add(10);
    //     hs.add(20);
    //     hs.add(30);
    //     hs.add(20); // Duplicate element, will not be added
    //     hs.add(10);
    //     System.out.println("HashSet: " + hs);
     }

}
