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


public class Main {
    public static void main(String[] args) {
        Bird b1 = new sparrow();
        b1.fly();
        b1.eat();
        b1 = new crow();
         b1.fly();
         b1.eat();
   }
}
