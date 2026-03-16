package Hashing.HashMap;


import java.util.LinkedHashMap;

class FirstNonRepeat {
    public static Character findFirst(String str){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        
        for(char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch, 1);
            }
        }
        
        for(char k : map.keySet()){
            if(map.get(k) == 1){
                return k;
            }
        }

        // Returning index instead of the Non Repeating Character instead of the characeter itself


        
        // for(int i=0; i<str.length(); i++){
        //     if(map.get(str.charAt(i)) == 1){
        //         return i;
        //     }
        // }
        
        return null;
    }
    public static void main(String[] args) {
        String str = "leetcode";
        
        System.out.println(findFirst(str));
    }
}

