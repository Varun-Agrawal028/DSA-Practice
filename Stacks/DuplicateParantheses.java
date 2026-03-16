package Stacks;

import java.util.Stack;

public class DuplicateParantheses{
    
    public static boolean duplicateParantheses(String str){
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch != ')'){
                stack.push(ch);
            }else{
                int count = 0;
                while(!stack.isEmpty() && stack.peek() != '('){
                    stack.pop();
                    count++;
                }
                
                if(count < 1){
                    return true;
                }else{
                    stack.pop();
                }
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        String str = "((a+b))";
        
        if(duplicateParantheses(str)){
            System.out.println("Duplicate parantheses exist");
        }else{
            System.out.println("Duplicate parantheses does not exist");
        }
    }
}