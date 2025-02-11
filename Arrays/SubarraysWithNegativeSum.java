package Arrays;

import java.util.Scanner;

public class SubarraysWithNegativeSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the length of the array
        System.out.println("enter the length of the array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read the elements of the array
        System.out.println("enter the elements in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int countNegativeSum = 0;

        // Generate all subarrays
        for (int i = 0; i < n; i++) { // Starting index of subarray
            for (int j = i; j < n; j++) { // Ending index of subarray
                int sum = 0;

                // Calculate the sum of the current subarray arr[i...j]
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                // Check if the sum is negative
                if (sum < 0) {
                    countNegativeSum++;
                }
            }
        }

        // Print the number of subarrays with negative sum
        System.out.println(countNegativeSum);

        scanner.close();
    }
}

