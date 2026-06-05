import java.util.Scanner;

public class A6 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("size of rows ");
        int row = sc.nextInt();
        System.out.println("size of col ");
        int col = sc.nextInt();
        int arr[][]= new int [row][col];
        for(int i=0; i<row; i++){
            System.out.println("element of row " +i);
            for(int j=0; j<col; j++){
                System.out.println("element of col " + j);
              arr[i][j] = sc.nextInt();
            }
        }
        // int sum = 0;
        int mult = 1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                int value = arr[i][j];
                // sum = sum + value;
                mult = mult * value;
            }
          }
        //   System.out.println( "Total: " + sum);
        System.out.println( "Ans " + mult);
    }
}
