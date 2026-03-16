package LinkedList;


/////////////////////////// Method 1 //////////////////////////////////

// T.C = O(n)
// S.C = O(n)

// import java.util.ArrayList;

// public class CheckPalindrome {
//     public static class Node {
//         int data;
//         Node next;
        
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
    
//     public void addFirst(int data){
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//     }
    
//     public boolean isPalindrome(){
//         ArrayList<Integer> tempList = new ArrayList<>();
        
//         Node temp = head;
        
//         while(temp != null){
//             tempList.add(temp.data);
//             temp = temp.next;
//         }
        
//         for(int i=0; i<tempList.size()/2; i++){
//             if(!tempList.get(i).equals(tempList.get(tempList.size()-1-i))){
//                 return false;
//             }
//         }
//         return true;
//     }
    
//     public static void main(String args[]){
//         CheckPalindrome ll = new CheckPalindrome();
        
//         ll.addFirst(1);
//         ll.addFirst(2);
//         ll.addFirst(2);
//         ll.addFirst(1);
        
//         if(ll.isPalindrome()){
//             System.out.println("its a palindrome");
//         }else{
//             System.out.println("its not a palindrome");
//         }
        
//     }
// }






//////////////////////////////// Method 2 //////////////////////////////////////

// T.C = O(n)
// S.C = O(n)



public class CheckPalindrome {
    public static class Node {
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean isPalindrome(){

        if(head == null || head.next == null){
            return true;
        }
        
        // 1. find mid
        Node mid = findMid(head);

        // 2. Reverse second half
        Node prev = null;
        Node curr = mid;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 3. comparing both halves
        Node left = head;
        Node right = prev;  // right half head

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    
    public static void main(String args[]){
        CheckPalindrome ll = new CheckPalindrome();
        
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.print();
        
        if(ll.isPalindrome()){
            System.out.println("its a palindrome");
        }else{
            System.out.println("its not a palindrome");
        }
    }
}
