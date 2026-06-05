public class A2 {
    public static void main(String[] args) {
        int accuracy = 100;
        if (accuracy >= 90 ){
            System.out.println("Excellent");

        }
        else if (accuracy >=75){
            System.out.println("Good");
        }
        else if (accuracy >=60){
            System.out.println("Average");
        }
        else {
            System.err.println("Needs Improvement");
        }
    }
}
