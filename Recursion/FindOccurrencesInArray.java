package Recursion;



public class FindOccurrencesInArray {
    public static void findOccurrences(int arr[], int key, int idx){
        // base case
        if(idx == arr.length){
            return;
        }
        
        // work
        if(arr[idx] == key){
            System.out.print(idx + " ");
        }
        
        // recursive call
        findOccurrences(arr, key, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int find = 2;
        System.out.print("The occurrences of the key " + find + " are at the index : ");
        findOccurrences(arr, find, 0);
    }
}
