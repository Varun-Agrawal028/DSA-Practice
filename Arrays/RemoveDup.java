package Arrays;

import java.util.*;

class RemoveDup {
    public static int[] removeDuplicates(int arr[]) {
        if (arr.length == 0) return new int[0];

        Arrays.sort(arr);  // Step 1: Sort the array
        int[] temp = new int[arr.length];
        int index = 0;

        // Step 2: Keep only different elements
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[index++] = arr[i];
            }
        }
        // Add the last element
        temp[index++] = arr[arr.length - 1];

        // Step 3: Copy only filled part
        return Arrays.copyOf(temp, index);
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 4, 4, 4};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
}



// class Main {
//     public static void remove(int arr[]) {
//         int n = arr.length;
//         int newArr[] = new int[n];
//         int newIndex = 0;

//         for (int i = 0; i < n; i++) {
//             boolean isDuplicate = false;

//             // Check if arr[i] is already in newArr
//             for (int j = 0; j < newIndex; j++) {
//                 if (arr[i] == newArr[j]) {
//                     isDuplicate = true;
//                     break;
//                 }
//             }

//             // If not a duplicate, add to newArr
//             if (!isDuplicate) {
//                 newArr[newIndex++] = arr[i];
//             }
//         }

//         // Print only the filled part of newArr
//         for (int i = 0; i < newIndex; i++) {
//             System.out.println(newArr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 1, 2, 2, 3, 3};
//         remove(arr);
//     }
// }
