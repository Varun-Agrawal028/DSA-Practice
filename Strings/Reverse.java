package Strings;

// T.C = O(n)
// S.C = O(1)

public class Reverse {
    public static void main(String[] args) {
        String str = "varun";

        // Convert to char array (mutable)
        char[] chars = str.toCharArray();

        // Two-pointer swap
        int left = 0, right = chars.length - 1;
        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        // Create new reversed string from char array
        String reversed = new String(chars);

        System.out.println("Before Reversing: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}

