package Functions;

import java.util.*;

public class DecimalToBinary{
    
    public static int decToBin(int decNum){
        
        int bin = 0;
        int pow = 0;
        
        while(decNum>0){
            int rem = decNum % 2;
            bin = bin + rem * (int)Math.pow(10,pow);
            decNum = decNum / 2;
            pow ++;
        }
        return bin;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the decimal number : ");
        int n = sc.nextInt();
        
        int result = decToBin(n);
        
        System.out.println(result);

        sc.close();
    }
}