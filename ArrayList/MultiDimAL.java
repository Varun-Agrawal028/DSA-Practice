package ArrayList;

import java.util.*;

class MultiDimAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        
        mainList.add(list);
        mainList.add(list2);
        
        System.out.println(mainList); // [[1, 2, 3], [4, 5, 6]]
        System.out.println(mainList.get(0)); // [1, 2, 3]
        

        // Printing the ArrayList using a for loop
        for(int i=0; i<mainList.size(); i++){ 
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
