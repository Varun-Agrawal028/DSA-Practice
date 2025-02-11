package Strings;

import java.util.*;
public class printSubstring{
    
    public static String printSubString(String str, int si, int ei){
        String subString = "";
        
        for(int i=si; i<ei; i++){
            subString += str.charAt(i);
        }
        return subString;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String string = "HelloWorld";
        
        int start_index = 0;
        int end_index = 4;
        
        System.out.println(printSubString(string, start_index, end_index));

        /////////// TODO: Java inbuit Method to find the Substring ///////////////////////////

        String sub = string.substring(0,4);
        System.out.println("This substring using java inbuit method" + sub);

        sc.close();
    }
}
