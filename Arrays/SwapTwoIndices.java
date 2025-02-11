package Arrays;

import java.util.*;
public class SwapTwoIndices {

    public static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter the elements in the array : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The entered elements are : ");
        for(int i=0; i<arr.length; i++){
            System.err.print(arr[i] + " ");
        }
        
        System.out.println();

        //asking the indices to swap

        System.out.println("enter the indices that you want to swap in the array : ");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();

        //calling the swap function

        swap(arr, index1, index2);

        sc.close();
    }
}
