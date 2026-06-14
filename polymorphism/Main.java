public class Main{
    public static void main (String[] arg){
        Calculator c = new Calculator();
       System.out.println( c.add(2 ,4));
      System.out.println( c.add(2,3,4));
      System.out.println ( c.add(2.1,4.8,3.3,5));
    }
}