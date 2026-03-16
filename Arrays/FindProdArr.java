package Arrays;


class FindProdArr {
    public static int[] findProdArr(int arr[]){
        int prodArr[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int prod = 1;
            for(int j=0; j<arr.length; j++){
                if(i != j){
                    prod = prod * arr[j];
                }
            }
            prodArr[i] = prod;
        }
        return prodArr;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        
        int result[] = findProdArr(arr);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
