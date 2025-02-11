package TwoDArrays;

import java.util.*;
public class SearchanElement {
    public static int[] searchElement(int arr[][], int rows, int cols, int x){
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(arr[i][j]==x){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows of the 2d array : ");
        int rows=sc.nextInt();
        System.out.println("enter the coloumn of the array : ");
        int cols=sc.nextInt();

        int arr[][] = new int[rows][cols];

        System.out.println("enter the elements in the array : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the element to be searched : ");
        int x=sc.nextInt();

        int index[]=searchElement(arr, rows, cols, x);

        if(index==null){
            System.out.println("Element not found");
        }else{
            System.out.println("The index is at row : " + index[0] + " and coloumn : " + index[1]);
        }
        sc.close();
    }
}
