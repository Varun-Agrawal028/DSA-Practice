package Arrays;

class ProdSum {
    public static int[] prodSum(int arr[], int thres){
        int n = arr.length;
        int[] newArr = new int[n];

        // Step 1: Compute the total sum of all elements
        int totalSum = 0;
        for (int val : arr) {
            totalSum += val;
        }

        // Step 2: Compute the sum of all other elements for each index
        for (int i = 0; i < n; i++) {
            int sumExcludingI = totalSum - arr[i];
            if (sumExcludingI <= thres) {
                newArr[i] = sumExcludingI;
            } else {
                newArr[i] = thres;
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 6, 4};
        int thres = 8;

        int result[] = prodSum(arr, thres);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
