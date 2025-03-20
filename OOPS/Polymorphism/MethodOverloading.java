
////   Compiler time  Polymorphism (static polymorphism)

package OOPS.Polymorphism;

public class MethodOverloading {
    public static void main(String args[]){
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(3.5f, 5.5f));
        System.out.println(c1.sum(3, 5,6));
        System.out.println(c1.sum(3, 5));
    }
}

class Calculator{
    int sum(int a , int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

}





////////// METHOD OVERLOADING IMPLEMENTED WITH PRINTSUM() FUNCTION ///////////////////////////////////////





// package Polymorphism;

// public class MethodOverloading {
//     public static void main(String args[]){
//         Calculator c1 = new Calculator();
//         c1.printSum(3.5f, 5.5f);
//         c1.printSum(3, 5, 6);
//         c1.printSum(3, 5);
//     }
// }

// class Calculator{
//     int sum(int a , int b){
//         return a + b;
//     }

//     float sum(float a, float b){
//         return a + b;
//     }

//     int sum(int a, int b, int c){
//         return a + b + c;
//     }

//     // Print function
//     void printSum(int a, int b){
//         System.out.println("Sum: " + sum(a, b));
//     }

//     void printSum(float a, float b){
//         System.out.println("Sum: " + sum(a, b));
//     }

//     void printSum(int a, int b, int c){
//         System.out.println("Sum: " + sum(a, b, c));
//     }
// }








///////// METHOD OVERLOADING WITHOUT CREATING ANOTHER CLASS /////////////////////////////////////////



// public class MethodOverloading {

//     public static int sum(int a , int b){
//         return a+b;
//     }

//     public static float sum(float a, float b){
//         return a+b;
//     }

//     public static int sum(int a, int b, int c){
//         return a+b+c;
//     }

//     public static void main(String args[]){
//         float result = sum(3.5f,5.5f);
//         System.out.println("the sum is : " + result);
//     }
// }

