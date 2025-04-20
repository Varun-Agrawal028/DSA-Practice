package Recursion;



class FindLastOccurrence {
    public static int lastOccurrence(int arr[], int key, int index){
        if(index < 0){
            return -1;
        }
        if(arr[index] == key){
            return index;
        }
        
        return lastOccurrence(arr, key, index-1);
    }
    public static void main(String[] args) {
        int array[] = {2,4,1,3,2,8,5,1};
        int find = 1;
        int result = lastOccurrence(array, find, array.length-1);
        
        if(result == -1){
            System.out.println("key not found");
        }else{
            System.out.println("The last occurrence of the key " + find + " is " + result);
        }
    }
}
