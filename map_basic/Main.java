import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        List<student10> students = new ArrayList<>();
        students.add(new student10(26, "asmit", 60));
        students.add(new student10(21, "smit", 70));
        students.add(new student10(27, "amit", 80));
        students.add(new student10(23, "sumit", 90));
        System.out.println(students);
        // Collections.sort(students);
        Collections.sort( students, new Comparator<student10>(){
            @Override
            public int compare(student10 o1, student10 o2){
                return o1.weight - o2.weight;
            }
        });
        // short form
        // Collections.sort( students,(o1,o2) -> o1.weight - o2.weight);
        System.out.println(students);

      }
        }
        // for array
        // Integer[]arr ={8,6,2,4,1,5};
        // Arrays.sort(arr);/Arrays.sort(arr)
        // for(int a: arr){
        // Systen.out.print(a +" ")
        // }