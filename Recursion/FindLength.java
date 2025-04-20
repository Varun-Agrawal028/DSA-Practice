package Recursion;


// This program finds the length of a string using recursion.
// It counts the first character and then calls itself with the substring excluding the first character until the string becomes empty.

public class FindLength {

    public static int findLength(String str) {
        // Base case: when the string becomes empty
        if (str.equals("")) {
            return 0;
        }

        // Recursive step: count 1 and move to the substring (excluding first character)
        return 1 + findLength(str.substring(1));
    }

    public static void main(String[] args) {
        String input = "varun";
        int length = findLength(input);
        System.out.println("Length of the string \"" + input + "\" is: " + length);
    }
}

