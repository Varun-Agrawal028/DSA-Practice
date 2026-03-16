package Stacks;

/////////////////////////////////////////// Brute Force ///////////////////////////////////////////////

// T.C = O(n^2)

// import java.util.ArrayList;
// class NextGreaterElement {
//     public static void nextGreaterElement(int arr[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i=0; i<arr.length; i++){
//             boolean found = false;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[j] > arr[i]){
//                     list.add(arr[j]);
//                     found = true;
//                     break;
//                 }
//             }
//             if(!found){
//                 list.add(-1);
//             }
//         }
//         System.out.println(list);
//     }
//     public static void main(String[] args) {
//         int arr[] = {6,8,0,1,3};
        
//         nextGreaterElement(arr);
//     }
// }






/////////////////////////////////////// Using Stacks /////////////////////////////////////////////

// T.C = O(n)



import java.util.Stack;

class NextGreaterElement {

    // Function to fill nextGreater[] with the next greater element for each item in arr[]
    public static void nextGreaterElement(int arr[], int nextGreater[]) {
        Stack<Integer> stack = new Stack<>(); // Stack to keep potential next greater elements

        // Traverse the array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            
            // Remove all elements smaller than or equal to arr[i] from the stack
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, there is no greater element to the right
            if (stack.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                // The top of the stack is the next greater element
                nextGreater[i] = stack.peek();
            }

            // Push current element to stack for future comparisons
            stack.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3}; // Input array
        int nextGreater[] = new int[arr.length]; // Output array to store next greater elements

        nextGreaterElement(arr, nextGreater); // Call the function

        // Print the next greater elements
        for (int n : nextGreater) {
            System.out.print(n + " ");
        }
    }
}
