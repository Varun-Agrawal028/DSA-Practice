package Hashing.HashMap;

//Brute Force - O(n2)

class LargestSubArrWithSum0 {
    public static void largestSubArrayWithSum0(int arr[]){
        int maxLen = 0;
        int start = -1;
        int end = -1;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                
                if(sum == 0){
                    int len = j-i+1;
                    if(len > maxLen){
                        maxLen = len;
                        start = i;
                        end = j;
                    }
                    
                }
            }
        }
        
        if(maxLen > 0){
            for(int i=start; i<=end; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println("\nLength : " + (end-start+1));
            
        }else{
            System.out.println("No zero sum subarray found");
        }
    }
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10};
        largestSubArrayWithSum0(arr);
    }
}
