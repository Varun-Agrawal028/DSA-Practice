package Functions;

public class FunctionOverloading{
    public static int multiply(int a, int b){
        return a*b;
    }
    
    public static int multiply(int a, int b, int c){
        return a*b*c;
    }
    
    public static float multiply(float a, float b){
        return a*b;
    }
    
    public static float multiply(float a, float b, float c){
        return a*b*c;
    }
    public static void main(String args[]){
        int num1=2;
        int num2=3;
        int num3=4;
        
        float num4=2.1f;
        float num5=2.2f;
        float num6=2.3f;
        
        float result = multiply(num4,num5);
        
        System.out.println("Result : " + result);
    }
}