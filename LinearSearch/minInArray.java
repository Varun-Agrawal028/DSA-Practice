package LinearSearch;

public class minInArray {
    public static int min(int arr[]){
        if(arr.length==0){
            return -1;
        }
        int ans=arr[0];
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={8,4,6,10,56,34};
        int minimum = min(arr);

        System.out.println("The minimum in the array is : " + minimum);
    }
}
