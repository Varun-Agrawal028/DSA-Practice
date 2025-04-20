package Recursion;

class FindExponent {
    public static int findExponent(int a, int b){
        if(b==0){
            return 1;
        }
        return a * findExponent(a,b-1);
    }
    public static void main(String[] args) {
        int x=2;
        int n=3;
        int result = findExponent(x,n);
        
        System.out.println("Expnent of x power n is : " + result);
    }
}
