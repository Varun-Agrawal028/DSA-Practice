package ArrayList;

import java.util.*;
public class CheckSorted{
    
    public static boolean isSorted(ArrayList<Integer> list){
        for(int i=0; i<list.size()-1; i++){
                if(list.get(i) > list.get(i+1)){
                    return false;
                }
        }
        return true;
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
        
        if(isSorted(list)){
            System.out.println("The list is sorted");
        }else{
            System.out.println("The list is not sorted");
        }
        
        sc.close();
    }
}
