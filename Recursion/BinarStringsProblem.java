package Recursion;

// print all binary strings of size n such that no two consecutive 1's are present in the string.
// for example, for n = 3, the output should be 000, 001, 010, 100, 101

import java.util.*;

public class BinarStringsProblem {
    public static void printBinaryStrings(int n, int lastplace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // kaam

        if(lastplace == 0){
            // sit 0
            printBinaryStrings(n-1, 0, str + "0");
            // sit 1
            printBinaryStrings(n-1, 1, str + "1");
        }else{
            // sit only 0
            printBinaryStrings(n-1, 0, str + "0");
        }

        // more concise way 

        // printBinaryStrings(n - 1, 0, str + "0");

        // if(lastplace == 0){
        //     printBinaryStrings(n - 1, 1,  str + "1");
        // }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of binary string: ");
        int n = sc.nextInt();

        String str = "";
        printBinaryStrings(n, 0,  str);

        sc.close();
    }
}
