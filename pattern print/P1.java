public class P1{
    static void main(){
        int n=4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("  ");
            }
            for(int j=n+1; j<=n+i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}