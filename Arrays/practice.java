
package Arrays;

import java.util.*;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //primitives

        // System.out.println("enter the size of the array : ");
        // int size = sc.nextInt();

        // int arr[] = new int[size];

        // System.out.println("enter the elements to be entered in the array : ");
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }

        // System.out.println("the entered elements are : ");
        // for(int i=0; i<arr.length; i++){
        //     System.out.print( arr[i] + " ");
        // }

        // System.out.println(Arrays.toString(arr));   //Anther way of printing arr elements automatically

        //Non Primitives

        System.out.println("enter the size of the array : ");
        int s = sc.nextInt();

        String str[] = new String[s];

        System.out.println("enter the elements in the array : ");
        for(int i=0; i<str.length; i++){
            str[i]=sc.next();
        }

        System.out.println("the entered elements are : ");
        System.out.println(Arrays.toString(str));
        sc.close();
    }
}
