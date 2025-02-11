package Strings;

import java.util.*;
public class PrintLargestString {

    public static String printLargestString(String fruits[]){
        String largest = fruits[0];
        for(int i=0; i<fruits.length; i++){
            if(fruits[i].compareTo(largest)>0){
                largest = fruits[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruits[] = new String[3];
        System.out.println("enter the fruits name : ");
        for(int i=0; i<fruits.length; i++){
           fruits[i] = sc.next();
        }
        
        String largestString = printLargestString(fruits);

        System.out.println("the largest String is : " + largestString);

        sc.close();
    }
}
