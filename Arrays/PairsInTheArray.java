package Arrays;

public class PairsInTheArray{
    public static int pairsInArray(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")" + " ");
                count++;
            }
        }
        System.out.println();
        return count;
    }
    public static void main(String args[]){
        int nums[] ={2,4,6,8,10};
        
        int total_pairs = pairsInArray(nums);
        
        System.out.println("total pairs are : " + total_pairs);
    }
}