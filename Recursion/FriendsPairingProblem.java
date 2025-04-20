package Recursion;

import java.util.*;

public class FriendsPairingProblem {

    public static int countWaystoPair(int n){

        //base case
        if(n == 1 || n == 2){
            return n;
        }

        //kaam

        // choice

        //single
        int single = countWaystoPair(n-1);

        //pair
        int pair = (n-1) * countWaystoPair(n-2);

        int totalWays = single + pair;

        return totalWays;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of friends : ");
        int num = sc.nextInt();

        int result = countWaystoPair(num);
        System.out.println("Total ways to pair are : " + result);

        sc.close();
    }
}
