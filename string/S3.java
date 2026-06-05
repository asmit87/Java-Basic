// import java.util.Scanner;

public class S3 {
    static void main() {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("provide the string");
        // String str = sc.nextLine();
        // System.out.println("value " + str);
        // System.out.println("provide the string");
        // String str1 = sc.next();
        // System.out.println("value " + str1 );
        int num = 23456;
        while(num != 0){
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }
    
}
