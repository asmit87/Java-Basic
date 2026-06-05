public class L8 {
    public static void main(String[] args) {
       // int  i=1;
         // do { 
           //System.out.println(i);
         // =i++; 
        //} 
        //while(i<=5)
        int n=4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
}
