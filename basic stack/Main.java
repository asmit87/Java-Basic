// package basic stack ;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st);
        st.push(20);
        System.out.println(st);
        st.push(30);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.search(20));
        System.out.println(st.search(40));
    }
}
