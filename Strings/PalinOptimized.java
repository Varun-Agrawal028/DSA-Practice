package Strings;

import java.util.*;

public class PalinOptimized{
    
    public static boolean isPalindrome(String str){
        
        if(str==null || str.length()==0){
            return true;
        }
        
        str = str.replaceAll("\\s", "").toLowerCase();
        
        for(int i=0; i<=str.length()/2; i++){
            int start = str.charAt(i);
            int end = str.charAt(str.length()-1-i);
            
            if(start!=end){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the sting : ");
        String string = sc.nextLine();
        
        if(isPalindrome(string)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
        
        sc.close();
    }
}
