package Recursion;


class FindFirstOccurrence {
    public static int firstOccurrence(int arr[], int index, int key){
        if(index == arr.length){
            return -1;
        }
        
        if(arr[index] == key){
            return index;
        }
        
        return firstOccurrence(arr, index + 1, key);
    }
    public static void main(String[] args) {
        int array[] = {2,4,3,2,8,5,1};
        int find = 2;
        int result = firstOccurrence(array, 0, find);
        
        if(result == -1){
            System.out.println("key not found ");
        }else{
            System.out.println("First Ocurrence of the key " + find +  " is at the index : " + result);
        }
    }
}
