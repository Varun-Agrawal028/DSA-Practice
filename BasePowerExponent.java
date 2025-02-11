import java.util.*;
public class BasePowerExponent {
    public static int baseTopowerExponent(int base, int exponent){
        int result=1;
        for(int i=1; i<=exponent; i++){
            result= result*base;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base number : ");
        int base=sc.nextInt();
        System.out.println("enter the exponent number : ");
        int exponent=sc.nextInt();

        int result = baseTopowerExponent(base, exponent);

        System.out.println("The Result is : " + result);

        sc.close();
    }
}
