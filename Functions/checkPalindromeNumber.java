package Functions;

import java.util.*;

public class checkPalindromeNumber {
    
    public static boolean checkPalindrome(int n) {
        int original = n;  // Store the original number
        int reverse = 0;   // Initialize reverse to 0
        
        // Reverse the number
        while (n > 0) {
            int lastDigit = n % 10;  // Get the last digit of n
            reverse = reverse * 10 + lastDigit;  // Build the reversed number
            n = n / 10;  // Remove the last digit from n
        }
        
        // Compare the original number with the reversed number
        return original == reverse;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        if (checkPalindrome(num)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
        sc.close();
    }
}

