package Arrays;

import java.util.*;
public class minmaxArray {
    public static void checkMinMax(int arr[], int size){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0; i<size; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The minimum element in the array is : " + min);
        System.out.println("The maximum element in the array is : " + max);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter the elements of the array : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        checkMinMax(arr, size);
        sc.close();
    }
}
