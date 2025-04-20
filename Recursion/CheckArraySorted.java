package Recursion;


////////////////// checking using iteration //////////////////////////////


// class ChecArraySorted {
//     public static boolean isSorted(int arr[]) {
//         // Loop through the array and check for unsorted pairs
//         for (int i = 0; i < arr.length - 1; i++) { // Avoid out-of-bounds access
//             if (arr[i] > arr[i + 1]) { // Found an unsorted pair
//                 return false;
//             }
//         }
//         return true; // If no unsorted pair is found, return true
//     }

//     public static void main(String[] args) {
//         int array[] = {1, 2, 3, 4, 5}; // Sorted array
//         boolean result = isSorted(array);
//         System.out.println("Is array sorted? " + result); // Expected: true

//         int array2[] = {1, 2, 6, 4, 5}; // Unsorted array
//         boolean result2 = isSorted(array2);
//         System.out.println("Is array sorted? " + result2); // Expected: false
//     }
// }





////////////////// checking using Recursion ////////////////////////////////


public class CheckArraySorted {
    // Recursive function to check if the array is sorted
    public static boolean isSortedRecursive(int arr[], int index) {
        // Base case: If we reach the last element, array is sorted
        if (index == arr.length - 1) {
            return true;
        }
        // If current element is greater than the next, it's not sorted
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        // Recursive call for the next index
        return isSortedRecursive(arr, index + 1);
    }

    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 5}; // Sorted array
        System.out.println("Is array sorted? " + isSortedRecursive(array1, 0)); // Expected: true

        int array2[] = {1, 2, 6, 4, 5}; // Unsorted array
        System.out.println("Is array sorted? " + isSortedRecursive(array2, 0)); // Expected: false
    }
}

