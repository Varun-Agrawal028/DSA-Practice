package Arrays;

import java.util.*;
public class MinMaxInArray {
    public static void minmax(int arr[], int size){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //finding minimum value
        for(int i=0; i<size; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        //finding maximum value
        for(int i=0; i<size; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("The Minimum value in the array is : " + min);
        System.out.println("The Maximum value in the array is : " + max);
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

        minmax(arr, size);

        sc.close();
    }
}
