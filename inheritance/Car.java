public class Car extends Vehicle {
    public int noOfDoors;
    public String transmissionType;
   public Car(String name, String model, int noOftyres, int noOfDoors, String transmissionType) {
        super(name, model, noOftyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }
    public void startAC(){
        System.out.println("AC started in: " + name );
    }
    public void stopAC(){
        System.out.println("AC stopped in: " + name );
    }
}
