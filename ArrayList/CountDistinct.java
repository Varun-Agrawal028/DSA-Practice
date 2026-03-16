package ArrayList;


import java.util.*;
class CountDistinct {
    public static int countDistinct(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(list.contains(arr[i])){
                continue;
            }else{
                list.add(arr[i]);
            }
        }
        return list.size();
    }
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        System.out.println(countDistinct(arr));
    }
}
