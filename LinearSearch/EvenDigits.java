package LinearSearch;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

//VeryInportant

public class EvenDigits {
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};

        System.out.println(findNumbers(nums));

        // System.out.println(digits(-54367));
    }

    public static int findNumbers(int nums[]){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }

    //function to check whether a numbers contains even digits or not
    public static boolean even(int nums){
        int numberofDigits = digits(nums);
        if(numberofDigits % 2 == 0){
            return true;
        }
        return false;
    }

    //count number of digits in a number
    public static int digits(int nums){

        if(nums<0){
            nums = nums * -1;   // for negative numbers. converting them to positive
        }

        if(nums==0){
            return 1;
        }

        int count = 0;

        while(nums>0){
            count ++;
            nums = nums/10;
        }
        return count;
    }


    //Another way of counting number of digits in a number
    //Alternative of digits() function

    // public static int digits2(int nums){
    //     if(nums<0){
    //         nums = nums * -1;   // for negative numbers. converting them to positive
    //     }
    //     return (int) (Math.log10(nums)) + 1;
    // }
}
