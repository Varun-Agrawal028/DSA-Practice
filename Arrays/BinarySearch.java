package Arrays;

import java.util.*;
public class BinarySearch{
    public static int binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(key<mid){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {5,2,7,8,2,9};
        int n = 8;
        
        Arrays.sort(nums);
        
        int result = binarySearch(nums, n);
        
        if(result == -1){
            System.out.println("key not found");
        }else{
            System.out.println("key is at the index : " + result);
        }
    }
}