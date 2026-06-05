import java.util.Scanner;
public class A5 {
    static void main(){
        // int arr[][];
        Scanner sc = new Scanner(System.in);
        System.out.print("size of row: " );
        int row = sc.nextInt();
        System.out.print("size of col: ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        // int n = arr.length;
        for(int i= 0; i<row; i++){
            System.out.println("element of i: " + i);
            for(int j=0; j<col; j++){
                System.out.println("element of j: " + j);
                arr[i][j] = sc.nextInt();
            }
        }
         for(int i= 0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
      }
}
