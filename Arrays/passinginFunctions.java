package Arrays;

import java.util.*;
public class passinginFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[]={1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

        sc.close();
    }

    public static void change(int arr[]){
        arr[0] = 6;
    }
}
