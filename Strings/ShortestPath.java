package Strings;

public class ShortestPath{
    
    public static float getShortestPath(String path){
        
        path = path.toUpperCase();
        int x=0;
        int y=0;
        
        for(int i=0; i<path.length(); i++){
            int direction = path.charAt(i);
            
            //east
            if(direction=='E'){
                x++;
            }
            //west
            else if(direction=='W'){
                x--;
            }
            //north
            else if(direction=='N'){
                y++;
            }
            //south
            else if(direction=='S'){
                y--;
            }
        }
        int x2 = (x-0)*(x-0);
        int y2 = (y-0)*(y-0);
            
        return (float)Math.sqrt(x2 + y2);
    }
   
    public static void main(String args[]){
        
        String path = "WNEENESENnN";
        
        float shortestPath = getShortestPath(path);
        
        System.out.println("the shortest path will be : " + shortestPath);
    }
}
