package Hashing.HashSet;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class FindPair {
    public static void findPair(int arr[], int k){
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        
        for(int num : arr){
            set.add(num);
        }
        
        ArrayList<Integer> list = new ArrayList<>(set);
        
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                int a = list.get(i);
                int b = list.get(j);
                
                if(a > b && (a-b == k)){
                    System.out.println(a + ", " + b);
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 1, 7, 8, 9};
        
        findPair(arr, 3);
    }
}