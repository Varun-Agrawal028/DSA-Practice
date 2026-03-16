package ArrayList;

import java.util.*;

public class CollectDigits {
    public static void collectDigits(int number, List<Integer> digits) {
        if (number == 0) return;

        collectDigits(number / 10, digits); // go to leftmost digit
        digits.add(number % 10); // add current digit to list
    }

    public static void main(String[] args) {
        int num = 1947;
        List<Integer> digits = new ArrayList<>();

        if (num == 0) {
            digits.add(0);
        } else {
            collectDigits(num, digits);
        }

        System.out.println("Digits: " + digits);
        
        // Example: sum of digits
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        System.out.println("Sum of digits: " + sum);
        
        // Reverse the digits list
        Collections.reverse(digits);
        System.out.println("Reversed Digits: " + digits);    }
}

