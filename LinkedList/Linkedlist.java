package LinkedList;
// LinkedList implementation in Java
// This code defines a singly linked list with methods to add nodes at the beginning.

public class Linkedlist {
    public static class Node {
        int data;
        Node next;
        // Constructor to initialize a new node
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;

    //variable to calculate the size of the linkedlsit
    public int size;


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

    // Method to add node at the last
    public void addLast(int data){              // T.C = O(1)
        Node newNode = new Node(data);
        size++;
        
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;

        //when tail pointer is not there - O(n)

        // Node temp = head;
        // while (temp.next != null) {
        //     temp = temp.next;
        // }

        // temp.next = newNode;
    }

    // Method to add a Node at a specific index in the linked list
    public void addMiddle(int idx, int data){                                 // T.C = O(n)
        // Case 1: If index is 0, we're just adding at the beginning
        if(idx == 0){
        addFirst(data);  // Reuse the addFirst method
        return;
        }

    // Step 1: Create a new node with the given data
    Node newNode = new Node(data);
    size++;

    // Step 2: Start from the head to find the node just before the desired index
    Node temp = head;
    int i = 0;

    // Move temp to the (idx - 1)th node
    while(i < idx - 1){
        temp = temp.next;
        i++;
    }

    // Step 3: Link the new node to the next node in the list
    newNode.next = temp.next;

    // Step 4: Link the previous node to the new node
    temp.next = newNode;
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
    
    // Method to delete a node at the beginning
    public int removeFirst(){

        // Case 1 - if the list is emppty
        if(head == null){
            System.out.println("the linkelist is empty");
            return Integer.MIN_VALUE;
        }

        // Case 2 - if there is only one node in the list
        if(head == tail){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // Case 3 - Move head to the next node
        int val = head.data;
        head = head.next;

        size--;
        return val;
    }

    //  Method to delete a node from the last
    public int removeLast(){

        //case 1
        if(head == null){
            System.out.println("The list is empty");
            return Integer.MIN_VALUE;
        }

        //case 2
        if(head == tail){
            int val = tail.data;
            head = tail = null;
            size = 0;

            return val;
        }

        //case 3

        // prev : i = size - 2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;

        size--;

        return val;
    }
    
    public static void main(String args[]){
        Linkedlist ll = new Linkedlist();
        ll.addFirst(1);
        ll.addFirst(2);

        ll.addLast(5);
        ll.addLast(6);

        ll.addMiddle(2, 9);

        ll.printList();

        System.out.println("size of linkedlist = " + ll.size);

        System.out.println();
        System.out.println();

        // getting the removed value that is first node
        int removedValue = ll.removeFirst();
        System.out.println("The removed value is = " + removedValue);

        ll.printList();

        System.out.println();

        ll.removeLast();
        ll.printList();

    }
}