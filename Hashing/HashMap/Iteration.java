package Hashing.HashMap;

import java.util.HashMap;
import java.util.Set;

// how to iterate on a HashMap
public class Iteration {
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 150);
        map.put("China", 140);
        map.put("US", 40);
        map.put("Indonesia", 20);

        Set<String> keys = map.keySet();

        System.out.println(keys);

        for(String k : keys){
            System.out.println("keys : " + k + ", Values : " + map.get(k));
        }

    }
}
