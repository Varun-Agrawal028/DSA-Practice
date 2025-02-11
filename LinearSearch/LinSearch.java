package LinearSearch;

public class LinSearch {

    //this function return the target element
    public static int linearSearch2(int arr[], int element_index){
        if(arr.length==0){
            return -1;
        }

        if(element_index>0 && element_index<arr.length){
            return arr[element_index];
        }
        return Integer.MAX_VALUE;   //he we are not returning -1 because -1 could be the element also
    }                               //so we are returning a constant

    //this function returns the target index
    public static int linearSearch(int arr[], int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={23,2,5,89,-1,64,89,-19,34};
        int target=5;

        int findelementAtindex = 4; //giving index as a input to find the element on that index
                                    //for linearsearch2

        // int index = linearSearch(arr,target);  //calling the function linearseach1

        int elementAtindex =linearSearch2(arr,findelementAtindex);   //calling linearsearch2

        //for linearseach1
        // if(index==-1){
        //     System.out.println("element not found");
        // }else{
        //     System.out.println("The element is at index : " + index);
        // }

        
        //for linearseach2
        if(elementAtindex==Integer.MAX_VALUE){
            System.out.println("element not found at index " + findelementAtindex);
        }else{
            System.out.println("The element is at index " + findelementAtindex + " is " + elementAtindex);
        }

    }
}
