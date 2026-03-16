package Stacks;

import java.util.Stack;

public class ValidParantheses {
    
    // Function to check if the parentheses in the input string are valid (balanced)
    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>(); // Stack to keep track of opening brackets
        
        // Traverse through each character in the string
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            // If current character is an opening bracket, push it to the stack
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else {
                // If it's a closing bracket, first check if the stack is empty
                if (stack.isEmpty()){
                    return false; // No matching opening bracket
                } 
                
                // Check if the top of the stack is the matching opening bracket
                if((ch == ')' && stack.peek() == '(') || 
                   (ch == '}' && stack.peek() == '{') ||
                   (ch == ']' && stack.peek() == '[')){
                    stack.pop(); // Matching pair found, remove opening bracket
                } else {
                    return false; // Mismatched bracket
                }
            }
        }
        
        // After traversing the string, stack should be empty if all brackets matched
        if(stack.isEmpty()){
            return true; // Valid parentheses
        } else {
            return false; // Unmatched opening brackets remain
        }
    }
    
    public static void main(String args[]){
        String str = "(({[]}())"; // Test input with unbalanced parentheses
        System.out.println(isValid(str)); // Output: false
    }
}
