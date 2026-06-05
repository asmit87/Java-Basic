public class S4 {
    static void main(){
        int count =0;
        int l=2;
        int u=100;
        for(int i=l; i<=u; i++){
            boolean isPrime = true;
            for(int j=2; j<=i-1; j++){
                if(i%j ==0){
                 isPrime = false;  
                 break; 
                }
            }
            if(isPrime){
                System.out.println(i+ " ");

                count++;
            }
        }
        System.out.println( "count =" +count);
    }
    
}
