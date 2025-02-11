import java.util.*;
public class FibonacciSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of tems that ou want to print : ");
        int n=sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;

        for(int i=1; i<=n; i++){
            System.out.print(firstTerm + ", ");
            nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
        sc.close();
    }
}