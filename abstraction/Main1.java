 abstract class Bird {
    abstract void fly();
    abstract void eat();
}
class sparrow extends Bird {
    @Override
    void fly(){
        System.out.println("sparrow flying");
    }
    @Override
    void eat(){
        System .out.println("sparrow eating");
    }
}
class crow extends Bird {
    @Override
    void fly(){
        System.out.println("crow flying");
    }
    @Override
    void eat(){
        System.out.println("crow eating");
    }
}


public class Main1 {
    public static void doBirdstuff(Bird b){
        b.fly();
        b.eat();
    }
    public static void main(String[] args) {
        doBirdstuff(new sparrow());
        doBirdstuff(new crow());
   }
      }