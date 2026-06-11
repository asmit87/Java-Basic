public class Vehicle {
    public String name;
    public String model;
    public int noOftyres;
    public Vehicle(){
        this.name="unknown";
        this.model="unknown";
        this.noOftyres=0;
    }

    public Vehicle(String name, String model, int noOftyres) {
        this.name = name;
        this.model = model;
        this.noOftyres = noOftyres;
    }
    void startEngine(){
        System.out.println("Engine started: " + name + ", " + model);
    }
    void stopEngine(){
        System.out.println("Engine stopped: " + name + ", " + model);
    }
}
