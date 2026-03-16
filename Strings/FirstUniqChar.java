package Strings;

public class FirstUniqChar {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input = "leetcode";
        int index = solution.firstUniqChar(input);

        if (index != -1) {
            System.out.println("First unique character: '" + input.charAt(index) + "' at index " + index);
        } else {
            System.out.println("No unique character found.");
        }
    }
}

class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return i;
            }
        }
        return -1;
    }
}

