package Recursion;

import java.util.*;

public class PrintBinaryStrings {
    
    public static void printBinaryStrings(int n, String str){
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        //kaam
        //choice
        //0 case
        printBinaryStrings(n-1, str + "0");

        //1 case
        printBinaryStrings(n-1, str + "1");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str = "";
        System.out.println("enter the size of binary string : ");
        int size = sc.nextInt();

        System.out.println("Total binary strings of size " + size + " are : " + Math.pow(2, size));
        printBinaryStrings(size, str);

       
        sc.close();
    }
}
