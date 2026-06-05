public class P4 {
    static void main(){
        int n = 5;
        //  int count = 0;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                // System.out.print("* ");
                // System.out.print(j+" ");
                // System.out.print((char)'a'+count);
                // System.out.print((char)('A' + count) + " ");
                // count++;
                // System.out.print((char)((n-j)+'A' + (j - 1)) + " ");
                 System.out.print((char)((n-j)+'A' ) + " ");
            }
            System.out.println();
        }
    }
}
