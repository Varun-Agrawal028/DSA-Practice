package Arrays;

// // container with most water
// class ContainerWithMostWater {
//     // Brute force approach
//     // Time complexity : O(n^2)
//     // Space complexity : O(1)
//     // The idea is to find the maximum area of water that can be contained between two lines.
//     // The area is calculated as the width between the two lines multiplied by the height of the shorter line.
//     // We iterate through all pairs of lines and calculate the area for each pair, keeping track of the maximum area found.
//     public static int maxWater(int height[]){
//         int maxArea = 0;
        
//         for(int i=0; i<height.length-1; i++){
//             for(int j=i+1; j<height.length; j++){
//                 // width between the two lines
//                 int w = j-i;

//                 // height of the shorter line
//                 int h = Math.min(height[i], height[j]); 
                
//                 // area of water that can be contained between the two lines
//                 // area = width * height
//                 int area = w * h;
                
//                 // update the maximum area found so far
//                 maxArea = Math.max(maxArea, area);
//             }
//         }
//         return maxArea;
//     }
    
//     public static void main(String[] args) {
//         int height[] = {1,8,6,2,5,4,8,3,7};
//        int result = maxWater(height);
       
//        System.out.println("Maximum Water that a contain can hold : " + result);
//     }
// }



//  Two Pointer Approach
// Time Complexity : O(n)


//container with most water problem
//two pointer approach
// Time Complexity : O(n)
// This code calculates the maximum area of water that can be trapped between two heights
// in an ArrayList using a two-pointer approach.
// The two-pointer approach is more efficient than the brute force method
// because it reduces the time complexity from O(n^2) to O(n)
public class ContainerWithMostWater {
    
    public static int maxWater(int height[]){
        int maxArea = 0;
        int start = 0;
        int end = height.length-1;
        while(start<end){
                int w = end - start;
                int h = Math.min(height[start], height[end]);                
                int area = w*h;
                
                maxArea = Math.max(area, maxArea);

                // Move the pointer of the shorter line towards the center
                // This is because the area is limited by the shorter line
                // and we want to find a potentially taller line
                if(height[start]<height[end]){
                    start++;
                } else {
                    end--;
                }
        
        }
        return maxArea;
    }
    
    public static void main(String args[]){
        
        int height[] = {1,8,6,2,5,4,8,3,7};

        int result = maxWater(height);
        
        System.out.println(result);
    }
}
