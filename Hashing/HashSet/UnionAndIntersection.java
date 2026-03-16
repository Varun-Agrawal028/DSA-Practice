package Hashing.HashSet;


import java.util.*;
class UnionAndIntersection {
    public static void findUnion(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        
        System.out.println("Union : " + set);
        System.out.println("Size : " + set.size());
    }
    public static void findIntersection(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        
        for(int num : arr1){
            set.add(num);
        }
        
        for(int num : arr2){
            if(set.contains(num)){
                intersection.add(num);
            }
        }
        
        System.out.println("Intersection : " + intersection);
        System.out.println("Size : " + intersection.size());
    }
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        
        findUnion(arr1, arr2);
        findIntersection(arr1, arr2);
    }
}
