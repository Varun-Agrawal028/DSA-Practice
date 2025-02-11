package ArrayList;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>(5);

        // list.add(23);
        // list.add(34);
        // list.add(32);
        // list.add(8);
        // list.add(342);
        // list.add(232);

        // int element = list.get(0);
        // System.out.println(element);

        // System.out.println(list);

        // list.add(1,2); // 1 is the index and 2 is the element to be added
        // System.out.println(list);

        // list.set(4, 100);
        // System.out.println(list);

        // list.remove(5);
        // System.out.println(list);


        //Taking Input

        System.out.println("enter the elements in the array list : ");
        for(int i=0; i<10; i++){
            list.add(sc.nextInt());
        }

        //Printing Output

        System.out.println("the entered elements are : ");
        for(int i=0; i<10; i++){
            System.out.print(list.get(i) + " ");
        }

        sc.close();
    }
}
