package LinkedList;

// T.C of iterative search = O(n)

public class IterativeSearch {
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

    public int search(int key){
        if(head == null){
            System.out.println("the list is empty");
            return Integer.MIN_VALUE;
        }

        Node temp = head;

        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
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
        IterativeSearch ll = new IterativeSearch();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.printList();

        System.out.println(ll.search(3));
        System.out.println(ll.search(4));
        System.out.println(ll.search(10));

    }
}