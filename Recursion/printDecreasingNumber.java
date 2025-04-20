package Recursion;

// printing numbers in decreasing order using witout recursion(with Iteration)


// public class printDecreasingNumber{
//     public static void main(String args[]){
//         int n=5;
//         for(int i=n; i>=1; i--){
//             System.out.println(i);
//         }
//     }
// }




// using recursion

public class printDecreasingNumber {
    public static void printDecreasing(int n) {
        if (n == 0) {
            return; // stops further execution
        }
        System.out.println(n);
        printDecreasing(n - 1);
    }

    public static void main(String args[]) {
        int num = 10;
        printDecreasing(num);
    }
}






// public class printDecreasingNumber{
//     public static int printDecreasing(int n){
//         if(n==0){
//             return 1;
//         }
//         System.out.println(n);
//         n--;
//         return printDecreasing(n);
//     }
//     public static void main(String args[]){
//         int num = 5;
//         printDecreasing(num);
//     }
// }





