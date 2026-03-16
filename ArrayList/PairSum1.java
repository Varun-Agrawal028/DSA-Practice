package ArrayList;

import java.util.*;

// This code is for finding the pair of elements in an array whose sum is equal to a given number
// It uses a brute force approach with O(n^2) time complexity

public class PairSum1{
    // Function to find if there exists a pair in the list that sums up to the target
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        for(int i=0; i<list.size()-1; i++){
            for(int j=i+1; j<list.size(); j++){
                if((list.get(i) + list.get(j)) == target){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        int target = 5;
        
        boolean result = pairSum1(list, target);
        if(result)
            System.out.println("Pair found with the given sum");
        else
            System.out.println("No pair found with the given sum");
        

        sc.close();
    }
}


// This code is for finding all pairs in an array whose sum is equal to a given number

// import java.util.*;

// public class Main{
    
//     public static ArrayList<ArrayList<Integer>> pairSum1(ArrayList<Integer> list, int target){
        
//         ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
//         for(int i=0; i<list.size()-1; i++){
//             for(int j=i+1; j<list.size(); j++){
//                 if(list.get(i) + list.get(j) == target){
//                     ArrayList<Integer> pair = new ArrayList<>();
//                     pair.add(list.get(i));
//                     pair.add(list.get(j));
                    
//                     result.add(pair);
//                 }
//             }
//         }
//         return result;
//     }
    
//     public static void main(String args[]){
        
//         ArrayList<Integer> list = new ArrayList<>();
        
//         list.add(1);
//         list.add(2);       
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
        
//         int target = 5;
        
//         ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        
//         pairs = pairSum1(list, target);
        
//         // System.out.println(pairs);
        
//         for(ArrayList<Integer> i : pairs){
//             System.out.println(i);
//         }
    
//     }
// }
