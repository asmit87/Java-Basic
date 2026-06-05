import com.sun.jdi.PathSearchingVirtualMachine;
import java.util.Scanner;
public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n ");
        int n = sc.nextInt();
        // int count =0;
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                // System.out.print("* ");
                 System.out.print((char)('A' + (j-1)) + " ");
                //  count++;
            }
            char alpha = (char)(i + 'A' - 2);
            for (int j=1; j<=i-1; j++){
               System.out.print(alpha + " "); 
                alpha--; 
            }
            System.out.println();
        }
    }
}
