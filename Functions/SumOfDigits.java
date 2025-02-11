package Functions;

import java.util.*;

public class SumOfDigits{
    
    public static int sumOfDigits(int n){
        int sum = 0;
        
        while(n>0){
            
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a number : ");
        int a = sc.nextInt();
        
        int result = sumOfDigits(a);
        
        System.out.println("Sum of the Digits of the integer : " + result);
        
        sc.close();
    }
}
