package Arrays;

import java.util.*;
public class Array2 {
    public static int arraySearch(int arr[], int size){
        for(int i=0; i<size; i++){
            if(arr[i]==3){
                return i;
            }
        }
        return -1;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array : ");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("enter the elements in the array : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int index=arraySearch(arr, size);

        if(index==-1){
            System.out.println("element not found");
        }else{
            System.out.println("The index of element is : " + index);
        }
        sc.close();
    }
}
