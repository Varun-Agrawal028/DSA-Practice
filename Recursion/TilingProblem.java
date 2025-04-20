package Recursion;

import java.util.*;
public class TilingProblem{
    
    public static int tilingProblem(int n){  // 2 x n (Floor size)
        
            // base case
            if(n == 0 || n == 1 ){       
                return 1;
            }
            // vertical choice
            int verticalWays = tilingProblem(n-1);
            
            // horizontal choice
            int horizontalWays = tilingProblem(n-2);
            
            int totWays = verticalWays + horizontalWays;
            
            return totWays;
        }
        
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the board/floor (2xn)");
        int size = sc.nextInt();
        
        int totalWays = tilingProblem(size);
        
        System.out.println("Total Ways to fill the board : " + totalWays);

        sc.close();
    }
}
