package LinearSearch;

public class SearchinRange {
    public static int searchinRange(int arr[], int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start; i<=end; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {28,56,24,-5,78};
        int target=24;

        int start=1;
        int end=3;

        int ans=searchinRange(arr, target, start, end);

        System.out.println("The element is at index : " + ans);
    }
}
