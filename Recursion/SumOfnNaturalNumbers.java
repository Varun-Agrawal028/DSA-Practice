package Recursion;

public class SumOfnNaturalNumbers {
    public static int printSum(int n){
        if(n == 0){
            return 0;
        }
        return n + printSum(n-1);
        
    }
    public static void main(String args[]){
        int num=5;
        int result = printSum(num);
        System.out.println("The sum of first " + num + "natural numbers is " + result);
    }
}
