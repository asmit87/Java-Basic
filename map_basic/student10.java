

public class student10 implements Comparable<student10> {
    public int age;
    public String name;
    public int weight;
   
    public String toString() {
        return "student{"+ "age=" + age + ",name= '" + name + '\'' + ",weight=" + weight + '}';

    }

    public void setage(int age) {
        this.age = age; 
    }
     public int getage() {
            return age;
     }

    public void setweight(int weight) {
            this.weight = weight; 
    }

    public int getweight() {
            return weight;
    }
    public student10(int age, String name, int weight) {
         this.name = name;
                this.age = age;
                this.weight = weight;
    }

     public int compareTo(student10 that){
        // arrange acending order
        if(this.age == that.age){
            return this.name.compareTo(that.name);
        }
         return this.age - that.age;
        //  arrange decending order
        // return that.age - this.age;
     } 
}
    
    

