
import java.util.LinkedHashMap;

class CompressString {
    public static String compressStr(String str) {
        if(str == null) {
            return null;
        }
        
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        
        char arr[] = str.toCharArray();
        
        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(char key : map.keySet()) {
            sb.append(key);
            int val = map.get(key);
            sb.append(val);
        }
        
        String newStr = sb.toString();
        
        return(newStr.length() < str.length() ? newStr : str);
    }
    public static void main(String[] args) {
        String str = "abc";
        
        System.out.println(compressStr(str));
    }
}

/////////////////// Brute Force Approach ////////////////////////////

// class CompressString {
//     public static String compressStr(String str) {
//         if (str == null || str.length() == 0) {
//             return str;
//         }

//         StringBuilder sb = new StringBuilder();
//         int count = 1;

//         for (int i = 1; i < str.length(); i++) {
//             if (str.charAt(i) == str.charAt(i - 1)) {
//                 count++;
//             } else {
//                 sb.append(str.charAt(i - 1)).append(count);
//                 count = 1; // reset counter
//             }
//         }

//         // Append last character and count
//         sb.append(str.charAt(str.length() - 1)).append(count);

//         String compressed = sb.toString();
//         return (compressed.length() < str.length()) ? compressed : str;
//     }

//     public static void main(String[] args) {
//         String str = "aabcccccaaa";
//         System.out.println(compressStr(str));  // Output: a2b1c5a3
//     }
// }
