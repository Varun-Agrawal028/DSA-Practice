package Strings;

import java.util.*;
public class printCharInString{
    
    public static void printChar(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your name : ");
        String name = sc.nextLine();
        
        printChar(name);

        sc.close();
    }
}
