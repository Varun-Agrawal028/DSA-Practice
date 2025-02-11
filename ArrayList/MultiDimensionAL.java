package ArrayList;

import java.util.*;
public class MultiDimensionAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Initiall all the elements are NULL
        // so we have initialise it

        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }

        // Add the elements in the Arraylist

        System.out.println("enter the elements in the arraylist : ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                list.get(i).add(sc.nextInt());
            }
        }

        //Printing the Arraylist

        System.out.println(list);

        sc.close();
    }
    
}
