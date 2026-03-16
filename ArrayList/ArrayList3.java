package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


    // Printing the ArrayList using a for loop
    System.out.println("ArrayList elements using for loop:");
    for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    // Reversing the ArrayList using a for loop
    public static void reverseArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        System.out.println("Reversed ArrayList: " + reversedList);
    }
    // Reversing the ArrayList using Collections.reverse()
    public static void reverseArrayListUsingCollections(ArrayList<Integer> list) {
        Collections.reverse(list);
        System.out.println("Reversed ArrayList using Collections: " + list);
    }

    // Sorting the ArrayList using Collections.sort()
    public static void sortArrayList(ArrayList<Integer> list) {
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);
        Collections.sort(list, Collections.reverseOrder());  // Sort in descending order
        System.out.println("Sorted ArrayList in descending order: " + list);
    }

}
