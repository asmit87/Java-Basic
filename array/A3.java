import java.util.Scanner;
public class A3 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int n = arr.length;
        for(int i = 0; i<=n-1; i++){
            // System.out.println("elemtnt" + i);
            arr[i] = sc.nextInt();
        }
        // int sum = 0;
        // for(int i = 0; i<arr.length; i++){
        //     int value = arr[i];
        //     sum = sum + value;
        // }
        // System.out.println(sum);
        // int multi = 1;
        // for(int i =0; i< arr.length; i++){
        //     int value = arr[i];
        //     multi = multi * value;
        //      System.out.println(multi);
              int sub = 0;
        for(int i =0; i< arr.length; i++){
            int value = arr[i];
            sub = sub - value;
             System.out.println(sub);
        }

    }
}
