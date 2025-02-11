package Functions;

import java.util.*;


public class BinaryToDecimal{
    
    public static int binTodec(int binNum){
        int decimal=0;
        int power=0;
        
        while(binNum>0){
            int lastDigit = binNum % 10;
            
            decimal = decimal + (lastDigit * (int)Math.pow(2, power));
            
            power++;
            
            binNum = binNum/10;
        }
        
        // System.out.println("Decimal of " + binNum + " = " + decimal);
        return decimal;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a binary number : ");
        int a = sc.nextInt();
        
        int result = binTodec(a);
        System.out.println("Decimal of " + a + " = " + result);

        sc.close();

    }
}