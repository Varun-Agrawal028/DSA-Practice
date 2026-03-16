package ArrayList;

import java.util.*;

class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        //add 
        list.add(1);  //element  T.C = O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println(list);
        
        //get
        int element = list.get(2); //index  T.C = O(1)
        System.out.println("element at index 2 is : " + element);
        
        //remove
        list.remove(3); //index        T.C = O(n)
        System.out.println(list);
        
        //size of a list
        int size = list.size();      //T.C = O(n)
        System.out.println("size of list is : " + size);
        
        //set element at an index
        list.set(1, 100);           //T.C = O(n)
        
        //check element contains or not
        System.out.println(list.contains(100));   //T.C = O(n)
        
        //iterating over an list
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        
        
    }
}