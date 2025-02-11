package LinearSearch;

public class SearchInStrings {
    public static int linearSearch(String arr[], String key){
        if(arr.length==0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String names[] = {"varun", "Anand", "Sarthak", "Nikhil", "Nandan"};
        String target="Sarthak";

        int ans = linearSearch(names, target);

        if(ans==-1){
            System.out.println("The Name " + target + " not found");
        }else{
            System.out.println("The Name " + target + " is at index " + ans);
        }
    }
}
