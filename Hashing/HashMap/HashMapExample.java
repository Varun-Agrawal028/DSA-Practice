package Hashing.HashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String args[]) {
        //create
        HashMap<String, Integer> map = new HashMap<>();
        
        //insert - O(1)
        map.put("India", 150);
        map.put("China", 140);
        map.put("US", 40);
        map.put("Indonesia", 20);
        
        System.out.println(map);
        
        //get - O(1)
        int pop = map.get("India");
        System.out.println(pop);
        System.out.println(map.get("China"));
        System.out.println(map.get("Nepal"));
        
        //containsKey - O(1)
        boolean contains = map.containsKey("India");  //true
        System.out.println(contains);
        
        System.out.println(map.containsKey("Japan"));  //false
        
        //remove - O(1) - also returns the removed value
        System.out.println(map.remove("Indonesia")); //returns 20
        System.out.println(map.remove("Canada"));  //returns nulll as key does not exist
        System.out.println(map);  //indonesia renoved

        //finding size of the map
        System.out.println(map.size());

        // is empty()
        System.out.println(map.isEmpty()); //false - map is not empty

        // clear() - clears the map - empty
        map.clear(); //clears the map
        System.out.println(map.isEmpty()); //true - map is empty
        
    }
}