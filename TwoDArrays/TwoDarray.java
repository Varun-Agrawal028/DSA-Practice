package TwoDArrays;

import java.util.*;
public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows in an array : ");
        int rows=sc.nextInt();
        System.out.println("enter the number of coloumns in an array : ");
        int cols=sc.nextInt();

        int arr[][] = new int[rows][cols];

        System.out.println("enter the elements in the 2D array : ");

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements in the array are : ");

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
