// package queue_basic;
// import java.util.HashSet;
import java.util.Set;
// import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Hashset2 {
    public static void main(String[] args) {
        // HashSet implementation
        // Set<Integer> hs = new LinkedHashSet<>();
        Set<Integer> hs = new TreeSet<>();   
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(20); // Duplicate element, will not be added
        hs.add(10);
        System.out.println("HashSet: " + hs);
     }
}
