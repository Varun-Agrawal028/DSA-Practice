package Arrays;


class MergeByMax {
    public static void compare(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        
        int minLength = Math.min(n, m);
        int maxLength = Math.max(n, m);
        
        int newArr[] = new int[maxLength];
        int k=0;
        
        for(int i=0; i<minLength; i++){
            newArr[k] = Math.max(arr1[i], arr2[i]);
            k++;
        }
        
        if(n > m){
            for(int i=minLength; i<n; i++){
                newArr[k] = arr1[i];
                k++;
            }
        }else{
            for(int i=minLength; i<m; i++){
                newArr[k] = arr2[i];
                k++;
            }
        }
        for(int s : newArr){
            System.out.println(s + " ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = {2,4,6,8};
        int arr2[] = {1,2,3,10, 9, 45};
        
        compare(arr1, arr2);
    }
}
