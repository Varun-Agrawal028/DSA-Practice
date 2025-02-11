package LinearSearch;

public class MaxIn2DArrays {
    public static int max(int arr[][]){
        if(arr.length==0){
            return -1;
        }
        int max = Integer.MIN_VALUE;

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[][]={
            {89,45,23},
            {67,12,34,56},
            {2,6,10,23},
            {90,105}
        };

        int ans = max(arr);

        System.err.println("The maximum in the 2D array is : " + ans);
    }
}
