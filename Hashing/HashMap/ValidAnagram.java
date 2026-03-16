package Hashing.HashMap;

import java.util.HashMap;

public class ValidAnagram {
    public static void validAnagram(String str1, String str2){

        if(str1.length() != str2.length()){
            System.out.println("Not an Anagram!!");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str1.length(); i++){
            if(map.containsKey(str1.charAt(i))){
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
            }else{
                map.put(str1.charAt(i), 1);
            }
        }

        for(int i=0; i<str2.length(); i++){
            if(map.containsKey(str2.charAt(i))){
                int freq = map.get(str2.charAt(i));
                if(freq == 1){
                    map.remove(str2.charAt(i));
                }else{
                    map.put(str2.charAt(i), freq-1);
                }
            }else{
                System.out.println("Not an Anagram!!");
                return;
            }
        }

        if(map.isEmpty()){
            System.out.println("Anagram!!");
        }else{
            System.out.println("Not an Anagram!!");
        }
    }
    public static void main(String args[]){
        String str1 = "keen";
        String str2 = "knee";

        validAnagram(str1, str2);
    }
}
