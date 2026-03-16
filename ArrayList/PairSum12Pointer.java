package ArrayList;

import java.util.*;
public class PairSum12Pointer {
    // This code is for finding if there exists a pair in a sorted ArrayList whose sum is equal to a given number
// Using Two Pointer Technique
// The ArrayList should be sorted in ascending order for this technique to work
// Time Complexity: O(n)
    
    public static boolean pairSum2Pointer(ArrayList<Integer> list, int target){
        
        int lp = 0;
        int rp = list.size()-1;
        
        while(lp < rp){
            //case1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            //case2
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            }else{
                //case3
                rp--;
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        int target = 5;
        
        boolean result = pairSum2Pointer(list, target);
        
        if(result){
            System.out.println("Pair Exists");
        }else{
            System.out.println("Pair Does not Exist");
        }
    }
}
