package Arrays;

public class Kadanes {
    public static int kadanes(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxElement = arr[0]; //track the largest elment in case all are negative
        
        for(int i=0; i<arr.length; i++){
            currSum = currSum + arr[i];
            maxElement = Math.max(maxElement, arr[i]); //update max element
            
            if(currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        //if all numbers are negative then, return the max element
        if(maxSum == 0){
            return maxElement;
        }
        return maxSum;
    }
    public static void main(String args[]) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int arr2[] = {-5, -2, -8, -9};  // all negative test
        
        System.out.println(kadanes(arr));
        System.out.println(kadanes(arr2));
    }
}
