package Recursion;

///////////////////// removing consecutive duplicates /////////////////////////////

// class Main {
//     public static String removeDuplicates(String str) {
//         StringBuilder result = new StringBuilder();
//         for (int i = 0; i < str.length(); i++) {
//             // Add character only if it is not already in the result
//             if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
//                 result.append(str.charAt(i));
//             }
//         }
//         return result.toString();
//     }

//     public static void main(String[] args) {
//         String string = "appnacollege"; // Input string with duplicates
//         String result = removeDuplicates(string);
//         System.out.println("String after removing consecutive duplicates: " + result);
//     }
// }





class Main {
    public static void removeDuplicates(int idx, String str, StringBuilder newStr, boolean map[]){
        
        //base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam

        //finding current character
        char currChar = str.charAt(idx);

        if(map[currChar - 'a'] == true){
            //duplicate
            removeDuplicates(idx+1, str, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            removeDuplicates(idx+1, str, newStr, map);
        }
    }
    public static void main(String[] args) {
        String string = "appnnacollege";
        StringBuilder newStr = new StringBuilder();
        boolean map[] = new boolean[26];
        removeDuplicates(0, string, newStr, map);
    }
}










// public class RemoveDuplicates{
    
//     public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
//         // base case
//         if(idx == str.length()){
//             System.out.println(newStr);
//             return;
//         }
        
//         //kaam
//         char currentChar = str.charAt(idx);
//         if(map[currentChar - 'a'] == true){
//             //duplicate 
//             removeDuplicates(str, idx+1, newStr, map);
//         }else{
//             map[currentChar - 'a'] = true;
//             removeDuplicates(str, idx+1, newStr.append(currentChar), map);
//         }
            
//     }
    
//     public static void main(String args[]){
//         String string = "appnacollege";
//         removeDuplicates(string, 0, new StringBuilder(""), new boolean[26]);
        
//     }
// }
