package LinkedList;

// A class to implement a simple singly linked list with getter/setter and addFirst functionality
public class LinkedList2 {

    // Node class represents each element (node) in the linked list
    public static class Node {
        int data;      // value stored in the node
        Node next;     // reference to the next node

        // Constructor to initialize the node with data
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // These are the pointers to the first and last node of the list
    // Kept private for encapsulation
    private Node head;
    private Node tail;

    // =======================
    // GETTER AND SETTER METHODS
    // =======================

    // Getter for head (returns the starting node of the list)
    public Node getHead(){
        return head;
    }

    // Setter for head (sets the head to a new node)
    public void setHead(Node head){
        this.head = head;
    }

    // Getter for tail (returns the last node of the list)
    public Node getTail(){
        return tail;
    }

    // Setter for tail (sets the tail to a new node)
    public void setTail(Node tail){
        this.tail = tail;
    }

    // =======================
    // ADD FIRST METHOD (adds a node at the beginning of the list)
    // =======================
    public void addFirst(int data){
        // Step 1: Create a new node with the given data
        Node newNode = new Node(data);

        // Step 2: If the list is empty, both head and tail point to this new node
        if(getHead() == null){
            setHead(newNode);
            setTail(newNode);
            return; // done
        }

        // Step 3: Otherwise, insert the new node at the beginning
        newNode.next = getHead(); // Link newNode to the current head
        setHead(newNode);         // Update head to the newNode
    }

    // =======================
    // MAIN METHOD TO RUN THE CODE
    // =======================
    public static void main(String args[]){
        LinkedList2 ll = new LinkedList2(); // Create a new linked list

        // Adding elements at the beginning of the list
        ll.addFirst(1); // List: 1
        ll.addFirst(2); // List: 2 -> 1
        ll.addFirst(3); // List: 3 -> 2 -> 1

        // Optional: Add a method to print list for verification
        // ll.printList();
    }
}
