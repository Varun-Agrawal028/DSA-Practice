package Arrays;

import java.util.*;
public class checkAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array : ");
        int size=sc.nextInt();

        int arr[] = new int[size];

        System.out.println("enter the elements of the array : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("the array is in ascending order");
        }else{
            System.out.println("the array is not in ascending order");
        }
        sc.close();
    }
}
