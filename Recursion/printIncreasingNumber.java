package Recursion;

public class printIncreasingNumber{
    public static void printIncreasing(int n){
        if(n==11){
            return;
        }
        System.out.println(n);
        printIncreasing(n+1);
    }
    public static void main(String args[]){
        int num = 1;
        printIncreasing(num);
    }
}


