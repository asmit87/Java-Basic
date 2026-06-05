
import java.util.Scanner;

public class A2 {
    static void main() {
        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for(int i = 0; i<= n-1; i++){
            System.out.println("give input" + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("value");
        for(int val: arr){
            System.out.println(val);
        }
    }
    
}
