package Strings;

import java.util.*;
public class Palindrome{
    public static void palindrome(String str){
        
        str = str.replaceAll("\\s", "").toLowerCase();

        String newStr = reverseString(str);
        
        if(newStr.equals(str)){
            System.out.println("It is a Palindrome.");
        }else{
            System.out.println("It is not a Palindrome.");
        }
        
    }
    
    public static String reverseString(String str){
        
        // Another way of Reversing a String using StringBuffer////////////////

        // // conversion from String object to StringBuffer
        // StringBuffer sbr = new StringBuffer(str);
        // // To reverse the string
        // sbr.reverse();
        // System.out.println(sbr);
        
        StringBuilder str1 = new StringBuilder();
        
        str1.append(str);
        str1.reverse();
        
        System.out.println(str1);
        
        return str1.toString();
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a string : ");
        String string = sc.nextLine();
        
        palindrome(string);

        sc.close();
    }
}
