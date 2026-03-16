package Stacks;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "varun";
        Stack<Character> stack = new Stack<>();

        // Push characters to stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Pop characters to reverse
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("Before Reversing: " + str);
        System.out.println("Reversed String: " + reversed.toString());
    }
}

