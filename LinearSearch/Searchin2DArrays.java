package LinearSearch;

public class Searchin2DArrays {
    public static int[] search(int arr[][], int target){
        if(arr.length==0){
            return new int[]{-1, -1};
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int arr[][]={
            {89,45,23},
            {67,12,34,56},
            {2,6,10,23},
            {90,105}
        };

        int target=23;

        int answer[] = search(arr,target);

        for(int ans: answer ){
            System.out.print(ans + " ");
        }
    }
}
