package Stacks;

/////////////////////////////////////////// Brute Force Approach //////////////////////////////////

// T.C = O(n^2)


// public class StockSpanProblem {

//     public static int[] calculateSpan(int[] prices) {
//         int n = prices.length;
//         int[] span = new int[n];

//         for (int i = 0; i < n; i++) {
//             span[i] = 1; // Span is at least 1 for the current day
//             for (int j = i - 1; j >= 0; j--) {
//                 if (prices[j] <= prices[i]) {
//                     span[i]++;
//                 } else {
//                     break; // Stop when a higher price is found
//                 }
//             }
//         }

//         return span;
//     }

//     public static void main(String[] args) {
//         int[] prices = {100, 80, 60, 70, 60, 75, 85};
//         int[] span = calculateSpan(prices);

//         System.out.print("Stock Spans: ");
//         for (int s : span) {
//             System.out.print(s + " ");
//         }
//     }
// }




////////////////////////////// using Stacks ////////////////////////////////////////////

// T.C = O(n)
// S.C = O(n)

import java.util.Stack;
public class StockSpanProblem {

    public static void stockSpan(int[] stocks, int[] span) {
        Stack<Integer> s = new Stack<>();

        span[0] = 1;
        s.push(0);

        for(int i=1; i<stocks.length; i++){
            int currPrice = stocks[i];

            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);
        }
    }

    public static void main(String[] args) {
        int[] stocks = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        System.out.print("Stock Spans: ");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}


