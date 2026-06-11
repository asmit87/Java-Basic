public class MotorCycle extends Vehicle {
    public String handlebarStyle;
    public String suspenssionType;

    public MotorCycle(String name , String model, int noOftyres, String handlebarStyle, String suspenssionType) {
        super(name, model, noOftyres);
        this.handlebarStyle = handlebarStyle;
        this.suspenssionType = suspenssionType;
    }
    public void wheelie(){
        System.out.println(name + " is doing a wheelie!");

    }
    
    
    
}
