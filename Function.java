// public class Function {
//     public static void multiplication(int a, int b){
//         int mul=a*b;
//         System.out.println(mul);
//     }
//     public static void main(String[] args) {
//         int a=5;
//         int b=10;
//         multiplication(a,b);
//     }
// }

// import java.util.*;
// public class Function{
//     public static void product(int a, int b){
//         int prod=a*b;
//         System.out.println("The product of two numbers is : " + prod);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Two numbers : ");
//         int a=sc.nextInt();
//         int b=sc.nextInt();

//         product(a, b);
//     }
// }


// import java.util.*;
// public class Function{
//     public static int product(int a, int b){
//         return a*b;     
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Two numbers : ");
//         int a=sc.nextInt();
//         int b=sc.nextInt();

//         int result=product(a, b);
//         System.out.println("The product of two numbers is : " + result);
//     }
// }




/* Make a function to print the table of a given number n. */

// import java.util.*;
// public class Function{
//     public static void table(int a){
//         for(int i=1; i<=10; i++){
//             System.out.println(a*i);
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number : ");
//         int a=sc.nextInt();

//         System.out.println("The table of a given number is : ");
//         table(a);
//     }
// }



/*   Write a function to print the sum of all odd numbers from 1 to n.
 */



// import java.util.*;
// public class Function{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number n : ");
//         int n=sc.nextInt();

//         int sum=0;
//         for(int i=1; i<=n; i++){
//             if(i%2!=0){
//                 sum=sum+i;
//             }
//         }
//         System.out.println("The sum of all odd numbers from 1 To n is : " + sum);
//     }
// }




/* Write a program to enter the numbers till the user wants and at
 the end it should display the count of positive, negative and zeros entered. */



// import java.util.*;
// public class Function{
//     public static void main(String[] args) {
//         Scanner sc  = new Scanner(System.in);
//         int positiveCount=0;
//         int negativeCount=0;
//         int zeroCount=0;

//         char choice;
//         do{
//             System.out.println("enter a number : ");
//             int n=sc.nextInt();

//             if(n>0){
//                 positiveCount++;
//             }else if(n<0){
//                 negativeCount++;
//             }else{
//                 zeroCount++;
//             }

//             System.out.println("Do you want to add more numbers : (y/n)!");
//             choice = sc.next().charAt(0);
//         }while(choice =='y' || choice =='Y');

//         System.out.println("The positive counts are : " + positiveCount);
//         System.out.println("The negative counts are : " + negativeCount);
//         System.out.println("The zero counts are : " + zeroCount);

//     }
// }