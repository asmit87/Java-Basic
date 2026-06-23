// package map_basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;


public class Maphash1 {
    public static void main(String[] args) {
        // same for HashMap, LinkedHashMap, TreeMap
        Map<String, String> mapping = new HashMap<>();
        mapping.put("in", "India");
        // mapping.put("in", "India2");
        mapping.put("us", "United States");
        mapping.put("uk", "United Kingdom");
        System.out.println(mapping);

        Map<String, String> mapping2 = new HashMap<>();
        mapping2.put("br", "Brazil");
        mapping2.put("jr", "Japan");
        System.out.println( "Before: " + mapping2);
        mapping2.putAll(mapping);
        System.out.println( "After: " + mapping2);
        mapping2.remove("us");
        System.out.println( "After removing 'us': " + mapping2);
        // System.out.println(mapping2.size());  
        // mapping2.clear();
        // System.out.println(mapping2.size());
        
        mapping2.putIfAbsent("is", "India3");
        System.out.println(mapping2);
        // for getting the value of a key
        System.out.println(mapping2.get("uk"));
        // for getting the value of a key if it exists, otherwise return a default value
        System.out.println(mapping2.getOrDefault("ug", "Not Found"));
        // for checking if the map contains a specific key
        System.out.println(mapping2.containsKey("br"));
        // for checking if the map contains a specific value
        System.out.println(mapping2.containsValue("India"));
        System.out.println(mapping2);
        // for changing the value by key
        mapping2.replace("in", "indonesia");
        System.out.println(mapping2);
        // for getting all keys
        Set<String> keys = mapping2.keySet();
        System.out.println(keys);
        // for getting all values
        Collection<String> values = mapping2.values();
        System.out.println(values);
        // for getting all entries
        Set<Map.Entry<String, String>> entries = mapping2.entrySet();
        System.out.println(entries);

        Map<Integer, String> mapping3 = new HashMap<>();
        mapping3.put(1, "one");
        mapping3.put(2, "two");
        mapping3.put(3, "three");
        for (Map.Entry<Integer, String> entry : mapping3.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
         }
        }
    }