// package basic_array_and_list;
import java.util.ArrayList;
 import java.util.Collections;
 import java.util.Iterator;
import java.util.List;
 

public class Main {
    public static void main (String []args){
        ArrayList<Integer> list = new ArrayList<>();
        // List<Integer> list = new ArrayList<>();
        // Collection<Integer> collection = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);
        
        System.out.println(list.size());
        System.out.println(list2);
        list2.clear();
        System.out.println(list2.size());

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println( "Element: " + it.next());
        }
        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);
        
        System.out.println(list3.get(1));
        System.out.println( "before set" +  list3);
        list3.set(0,50);
        System.out.println( "after set" +  list3);

        Object []arr = list3.toArray();
        for(Object obj : arr){
            System.out.println("Array element: " + obj);
        }
         System.out.println(list3.contains(12));
        System.out.println(list3.contains(100));


        // sort
        list.add(5);
        list.add(2);
        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);

        // clone
        // ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
        // System.out.println("Cloned list: " + newList);
        // capacity
        ArrayList<Integer> mark = new ArrayList<>();
        mark.ensureCapacity(100);
        System.out.println(mark.isEmpty() );
        // System.out.println(newList.isEmpty());
        // System.out.println(newList.indexOf(30));


    }
    
}
    

