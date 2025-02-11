import java.util.*;
public class Checkprime {
    public static boolean isPrime(int a){
        if(a<=1){
            return false;
        }
        if(a==2){
            return true;
        }
        if(a%2==0){
            return false;
        }

        for(int i=3; i<Math.sqrt(a); i+=2){
            if(a%2==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int a=sc.nextInt();

        if(isPrime(a)){
            System.out.println("The number is Prime.");
        }else{
            System.out.println("The number is not prime");
        }
        sc.close();
    }
}
