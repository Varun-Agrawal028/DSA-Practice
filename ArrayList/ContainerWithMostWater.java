package ArrayList;

import java.util.*;
// ContainerWithMostWater.java

//brute force approach
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// The idea is to find the maximum area of water that can be contained between two lines.
// The area is calculated as the width between the two lines multiplied by the height of the shorter line.
// We iterate through all pairs of lines and calculate the area for each pair, keeping track of the maximum area found.
// The maximum area is returned as the result.
class ContainerWithMostWater {

    // Function to find the maximum area of water that can be contained
    // between two lines represented by the heights in the ArrayList.
    public static int maxWater(ArrayList<Integer> height){
        // Initialize maxArea to 0
        int maxArea = 0;
        
        for(int i=0; i<height.size()-1; i++){
            for(int j=i+1; j<height.size(); j++){
                // width between the two lines
                // i and j are the indices of the two lines
                int w = j-i;

                // height of the shorter line
                int h = Math.min(height.get(i), height.get(j));

                // area of water that can be contained between the two lines
                int area = w*h;
                
                // update the maximum area found so far
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(3);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        
        int result = maxWater(height);
       
        System.out.println("Maximum Water that a container can hold : " + result);
    }
}