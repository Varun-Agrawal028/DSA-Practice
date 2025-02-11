package TwoDArrays;

import java.util.*;
public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][2];
        // int arr2[][] = {
        //     {1,2,3},
        //     {4,5},
        //     {6,7,8,9}
        // };

        System.out.println("enter the elements in the 2d array : ");
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        System.out.println("the entered 2d array is : ");

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }



        // for(int row=0; row<arr.length; row++){                  //Another way of printing 2d arrays
        //     System.out.println(Arrays.toString(arr[row]));
        // }


        // for(int x[] : arr){                             //One more way of printing 2d arr
        //     System.out.println(Arrays.toString(x));
        // }


         sc.close();
    }
}
