package Arrays;

public class PrintSubArrays{
    public static int printSubArrays(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                count++;
            }
            System.out.println();
        }
        System.out.println();
        return count;
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10};
        
        int total_subArrays = printSubArrays(nums);
        
        System.out.println("total subarrays are : " + total_subArrays);
    }
}
