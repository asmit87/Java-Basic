 import java.util.Scanner;

public class A7 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("size of row " );
        int row = sc.nextInt();
        System.out.println("size of col ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0; i<row; i++){
            System.out.println("element of row " + i);
            for(int j=0; j<col; j++){
                System.out.println("element of col " +j);
                arr[i][j]= sc.nextInt();

            }
        }
        // int maxvalue = arr[0][0];
        int minvalue = arr[0][0];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                // if(arr[i][j]>maxvalue){
                    // maxvalue = arr[i][j];
                    if(arr[i][j] <minvalue){
                        minvalue = arr[i][j];  
                }
            }
        }
        // System.out.println(maxvalue);
        System.out.println(minvalue);

    }
}
