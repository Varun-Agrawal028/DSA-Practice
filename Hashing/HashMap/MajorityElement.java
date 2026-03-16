package Hashing.HashMap;

import java.util.HashMap;
import java.util.Set;

class MajorityElement {
    public static HashMap<Integer, Integer> majorityElement(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }
        return map;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        int n = arr.length;
        HashMap<Integer, Integer> map = majorityElement(arr);
        System.out.println(map);
        
        Set<Integer> keys = map.keySet();
        
        boolean found = false;
        
        for(int k : keys){
            if(map.get(k) > n/3){
                System.out.println("Majority Element : " + k);
                found = true;
            }
        }
        if(!found){
            System.out.println("No Majority Element Exists");
        }
    }
}




// class MajorityElement {
//     public static HashMap<Integer, Integer> majorityElement(int arr[]){
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i=0; i<arr.length; i++) {
//             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);  //short hand
//         }
//         return map;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
//         int n = arr.length;
//         HashMap<Integer, Integer> map = majorityElement(arr);
//         System.out.println(map);
        
        
//         boolean found = false;
        
//         for(int k : map.keySet()){  // we can directly traverse like this instead storing keys in set
//             if(map.get(k) > n/3){
//                 System.out.println("Majority Element : " + k);
//                 found = true;
//             }
//         }
//         if(!found){
//             System.out.println("No Majority Element Exists");
//         }
//     }
// }
