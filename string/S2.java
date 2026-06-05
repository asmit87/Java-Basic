public class S2 {
    static void main(){
        String name1 = "love";
        // .equals case sensitive hota hai
        String name2 = "LOver";
        // if(name1.equals(name2)){
        if(name1.equalsIgnoreCase(name2)){    
            System.out.println("both are same");
        }
        else{
            System.out.println("both are not same");
        }
    }
}
