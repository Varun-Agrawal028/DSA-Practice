package ArrayList;

import java.util.*;
public class Swap{
    
    public static void swap(ArrayList<Integer> list){
       int idx1 = 1, idx2 = 3;
       
       int temp = list.get(idx1);
       list.set(idx1, list.get(idx2));
       list.set(idx2, temp);
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
        
        swap(list);
        System.out.println(list);

        sc.close();
    }
}