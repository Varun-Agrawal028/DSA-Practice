package ArrayList;

import java.util.*;
public class FindMax{
    
    public static int findMax(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
            // max = Math.max(max, list.get(i));  // Another way to find max
        }
        
        return max;
    }
    
    public static void main(String args[]){
        
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the number of elements : ");
        int n = sc.nextInt();
        
        System.out.println("Enter the elements in the ArrayList : ");
        
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        int max = findMax(list);
        System.out.println("Max element : " + max);
        
        sc.close();
    }
}
