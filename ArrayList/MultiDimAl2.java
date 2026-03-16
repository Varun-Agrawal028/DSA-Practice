package ArrayList;

import java.util.*;

class MultiDimAl2 {
    public static void main(String[] args) {
        // Creating a 2D ArrayList (ArrayList of ArrayLists)
        // This is a list of lists, where each inner list can have different sizes
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        
        // Adding elements to the inner lists
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        //adding elements to the inner lists
        // Each inner list can have different sizes and elements
        for(int i=1; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        
        // demonstrating that inner lists can have different sizes
        list2.remove(3); // Removing the 4th element from list2
        list2.remove(2); // Removing the 3rd element from list3

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);


        System.out.println(mainList); // [[1, 2, 3, 4, 5], [2, 4, 6, 8, 10], [3, 6, 9, 12, 15]]
        System.out.println(mainList.get(0)); // [1, 2, 3, 4, 5]
        
        
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
