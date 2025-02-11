import java.util.*;
public class BubbleSort{
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        
        System.out.println("enter the elements in the array : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        // int arr[] = {3,1,5,4,2};
        bubbleSort(arr);
        
        System.out.println("The sorted array is : " + Arrays.toString(arr));
        sc.close();
    }
}