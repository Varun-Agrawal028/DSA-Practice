package TwoDArrays;

public class colnoFixed {
    public static void main(String[] args) {
        int arr[][] ={
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){   //for each row it will check the size of the col
                System.out.print(arr[row][col] + " ");
            }
            System.err.println();
        }
    }
}
