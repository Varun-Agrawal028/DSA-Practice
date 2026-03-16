package ArrayList;

import java.util.ArrayList;
//container with most water problem
//two pointer approach
// Time Complexity : O(n)
// This code calculates the maximum area of water that can be trapped between two heights
// in an ArrayList using a two-pointer approach.
// The two-pointer approach is more efficient than the brute force method
// because it reduces the time complexity from O(n^2) to O(n
public class cWMWater {
    
    public static int maxWater(ArrayList<Integer> height){
        int maxArea = 0;
        int start = 0;
        int end = height.size()-1;
        while(start<end){
                int w = end - start;
                int h = Math.min(height.get(start), height.get(end));                
                int area = w*h;
                
                maxArea = Math.max(area, maxArea);

                // Move the pointer of the shorter line towards the center
                // This is because the area is limited by the shorter line
                // and we want to find a potentially taller line
                if(height.get(start)<height.get(end)){
                    start++;
                } else {
                    end--;
                }
        
        }
        return maxArea;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int result = maxWater(height);
        
        System.out.println(result);
    }
}
