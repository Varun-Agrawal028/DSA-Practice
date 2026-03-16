package Arrays;

public class MaxSubarrSum{
    public static int maxSubarraySum(int arr[]){
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            currSum = 0;
            for(int j=i; j<arr.length; j++){
                currSum += arr[j];
                
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(maxSubarraySum(arr));
    }
}



// class Main {
//     public static void maxSumSubArray(int arr[]) {
//         int max = Integer.MIN_VALUE;
//         int start = 0, end = 0;

//         // Try every possible subarray
//         for (int i = 0; i < arr.length; i++) {
//             int sum = 0;
//             for (int j = i; j < arr.length; j++) {
//                 sum += arr[j];  // sum of subarray arr[i..j]

//                 // update max if this subarray has a larger sum
//                 if (sum > max) {
//                     max = sum;
//                     start = i;
//                     end = j;
//                 }
//             }
//         }

//         // print the result
//         System.out.println("Maximum Subarray Sum: " + max);
//         System.out.print("Subarray: [");
//         for (int i = start; i <= end; i++) {
//             System.out.print(arr[i]);
//             if (i < end) System.out.print(", ");
//         }
//         System.out.println("]");
//     }

//     public static void main(String[] args) {
//         int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
//         maxSumSubArray(arr);
//     }
// }
