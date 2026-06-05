import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value for n");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            for(int j =1; j<=i; j++){
                if(i==1 || i==2 || i==n || j==i || j==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
