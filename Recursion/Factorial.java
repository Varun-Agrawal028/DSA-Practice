package Recursion;

public class Factorial{
    public static int printFactorial(int n){
        if(n==0){
            return 1;
        }
        return n * printFactorial(n-1);
    }
    public static void main(String args[]){
        int num = 5;
        int result = printFactorial(num);
        System.out.println("Factoral of " + num + " is " + result);
    }
}
