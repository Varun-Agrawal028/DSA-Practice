package DivideNConquer;


class MergeSort {
    
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void mergeSort(int arr[], int si, int ei){
        //base case
        if(si>=ei){
            return;
        }
        
        //kaam
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); //left part
        mergeSort(arr, mid+1, ei); //right part
        merge(arr, si, mid, ei);
    }
    
    public static void merge(int arr[], int si, int mid, int ei){
        int tempArr[] = new int[ei-si+1];
        int i = si;  //iterator for left part
        int j = mid+1;  //iterator for right part
        int k = 0;  //iterator for temp array
        
        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                tempArr[k] = arr[i];
                i++; k++;
            }else{
                tempArr[k] = arr[j];
                j++; k++;
            }
        }
        
        //for leftover elements of 1st part
        while(i<=mid){
            tempArr[k++] = arr[i++];
        }
        
        //for leftover elements of 2nd part
        while(j<=ei){
            tempArr[k++] = arr[j++];
        }
        
        //copy the tempArr in orignal arr
        for(k=0, i=si; k<tempArr.length; k++, i++){
            arr[i] = tempArr[k];
        }
    }
    
    public static void main(String[] args) {
        int array[] = {6,3,9,5,2,8};
        mergeSort(array, 0, array.length-1);
        printArr(array);
    }
}
