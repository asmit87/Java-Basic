import java.util.Scanner;

public class A4 {
    static void main(){
          Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int n = arr.length;
        for(int i = 0; i<=n-1; i++){
            // System.out.println("elemtnt" + i);
            arr[i] = sc.nextInt();
             }
            //  int maxValue = arr[0];
            int minValue = arr[0];
             for(int i = 0; i<= n-1; i++){
                // if(arr[i] > maxValue){
                if(arr[i] < minValue){ 
                    // maxValue = arr[i];
                    minValue = arr[i];
                // }
                  }
             }
            //  System.out.println("max =");
            //  System.out.println( "max =" + maxValue);
              System.out.println( "min =" + minValue);
    }
}
