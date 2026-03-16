

package LinkedList;

// T.C of Recursive search = O(n)

public class RecursiveSearch {
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
    public static int size;

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);

        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    // Method to add node at the beginning
    public void addFirst(int data){             // T.C = O(1)
        //step 1 - create new node
        Node newNode = new Node(data);
        size++;
        
        // If the list is empty, set head and tail to the new node
        // This is also the case when we add the first node
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2 - add new Node in the linkedlist
        newNode.next = head; //link
        
        //step 3 - make newNode the new head
        head = newNode;
        
    }

    // Method to print the Linked List
    public void printList() {                 // T.C = O(n)
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;  // also fine, we're in the same class
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    

    public static void main(String args[]){
        RecursiveSearch ll = new RecursiveSearch();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.printList();

        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(4));
        System.out.println(ll.recSearch(10));

    }
}
