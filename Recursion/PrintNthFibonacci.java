package Recursion;

import java.util.*;
class PrintNthFibonacci {
    public static int printNthFibonaaci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return printNthFibonaaci(n-1) + printNthFibonaaci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index of the fibonacci series to print the number : ");
        int num = sc.nextInt();
        
        int result = printNthFibonaaci(num);
        System.out.println("The " + num + " number in the fibonacci series will be : " + result);
        
        sc.close();
    }
}
