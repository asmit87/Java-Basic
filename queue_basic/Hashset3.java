// package queue_basic;
import java.util.HashSet;

public class Hashset3 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student(1, "Asmit"); 
        Student s2 = new Student(1, "Asmit"); 
        Student s3 = new Student(1, "Asmit"); 
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println("HashSet: " + set);
    }
}
