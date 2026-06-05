public class M4 {
    static int add(int p, int q){
        int sum = p+q;
        return sum;
    }
    static int add(int p, int q, int r){
        int sum = p+q+r;
        return sum;
    }
   static void main (){
    int ans1 = add (5, 6);
    int ans2 = add(5 ,6 ,7);
    System.out.println("ans1 :" + ans1);
    System.out.println("ans2 :" + ans2);
   }
}

