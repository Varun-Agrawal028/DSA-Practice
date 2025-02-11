package Functions;

import java.util.*;

public class CheckPrime{
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        
        if(n==2){
            return true;
        }
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int a = sc.nextInt();
        
        boolean result = isPrime(a);
        
        if(result){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
        sc.close();
    }
}