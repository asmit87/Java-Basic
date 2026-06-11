public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 4, 4, "Automatic");
        MotorCycle bike1 = new MotorCycle("Harley-Davidson", "Street 750", 2, "Ape Hangers", "Telescopic");

        car1.startEngine();
        car1.startAC();
        car1.stopAC();
        car1.stopEngine();

        bike1.startEngine();
        bike1.wheelie();
        bike1.stopEngine();
      }
}
