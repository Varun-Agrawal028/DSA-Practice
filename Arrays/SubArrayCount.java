package Arrays;

public class SubArrayCount {

    // Function to calculate the number of subarrays
    public static int countSubarrays(int arr[]) {
        int n = arr.length; // Get the length of the array
        int totalSubarrays = 0; // Initialize the total number of subarrays

        // Loop over each possible starting point
        for (int i = 0; i < n; i++) {
            // Loop over each possible ending point
            for (int j = i; j < n; j++) {
                totalSubarrays++; // Count each subarray
            }
        }

        return totalSubarrays;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4}; // Example array
        int result = countSubarrays(arr); // Call the function to get the number of subarrays
        System.out.println("The number of subarrays is: " + result);
    }
}

