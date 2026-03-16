package Arrays;


import java.util.ArrayList;
class UniqueElements {
    public static ArrayList<Integer> unique(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            boolean isUnique = true;
            for(int j=0; j<arr.length; j++){
                if(i != j && arr[i] == arr[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4};
        System.out.println(unique(arr));
    }
}





// import java.util.*;

// class Main {
//     public static int[] findUnique(int arr[]) {
//         int unique[] = new int[arr.length];
//         int index = 0; // index for unique array

//         for (int i = 0; i < arr.length; i++) {
//             boolean isUnique = true;
//             for (int j = 0; j < arr.length; j++) {
//                 if (i != j && arr[i] == arr[j]) {
//                     isUnique = false;
//                     break;
//                 }
//             }
//             if (isUnique) {
//                 unique[index++] = arr[i]; // store unique element
//             }
//         }

//         // Return only the filled part of the array
//         return Arrays.copyOf(unique, index);
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 1, 2, 2, 3, 4, 4};
//         System.out.println(Arrays.toString(findUnique(arr)));
//     }
// }

