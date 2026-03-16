package LinkedList;

public class RemoveCycle {
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

    public void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean detectCycle(){   // floyds cycle detecting algo
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public void removeCycle(){

        // Detect Cycle
        Node slow = head;
        Node fast = head;

        boolean hasCycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                hasCycle = true;
                break;
            }
        }
        if(hasCycle == false){
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null;

        while(slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        // Remove cycle -> lastNode.next
        prev.next = null;
    }


    public static void main(String args[]){
        RemoveCycle ll = new RemoveCycle();
        
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        System.out.println(detectCycle());

        ll.removeCycle();

        System.out.println(detectCycle());
    }
}

// public class RemoveCycle {
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

//     public void print(){
//         Node temp = head;

//         while(temp != null){
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public boolean removeCycle(){
//         Node slow = head;
//         Node fast = head;

//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;

//             if(slow == fast){  // Cycle detected
//                 slow = head;
//                 Node prev = null;

//                 while(slow != fast){
//                     prev = fast;
//                     slow = slow.next;
//                     fast = fast.next;
//                 }

//                 // 'prev' now points to the last node in the cycle
//                 prev.next = null;  // Remove the cycle
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]){
//         RemoveCycle ll = new RemoveCycle();
        
//        head = new Node(1);
//         Node temp = new Node(2);
//         head.next = temp;
//         head.next.next = new Node(3);
//         head.next.next.next = temp;  // creting a cycle

//         if(ll.removeCycle()){
//             System.out.println("Cycle existed and was removed.");
//         } else {
//             System.out.println("No cycle in the linked list.");
//         }

//         ll.print();  // Should now print the list without a cycle
//     }
// }

