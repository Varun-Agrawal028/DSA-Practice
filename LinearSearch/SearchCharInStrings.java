package LinearSearch;

import java.util.*;
public class SearchCharInStrings {
    public static boolean linearSearch(String str, char target){
        if(str.length()==0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name = "Varun";
        char character = 'r';

        boolean ans = linearSearch(name, character);

        System.out.println(ans);

        System.out.println(Arrays.toString(name.toCharArray()));
    }
}
