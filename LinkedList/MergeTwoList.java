package LinkedList;

public class MergeTwoList {
    // Node class
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to merge two sorted linked lists
    public static Node mergeLists(Node head1, Node head2) {
        Node dummy = new Node(-1);  // Dummy node to simplify logic
        Node tail = dummy;

        // Traverse both lists
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        // Attach remaining elements
        if (head1 != null) tail.next = head1;
        if (head2 != null) tail.next = head2;

        return dummy.next;  // Head of merged list
    }

    // Function to print the linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        // List 1: 1 -> 3 -> 5
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        // List 2: 2 -> 4 -> 6
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        System.out.println("List 1:");
        printList(head1);

        System.out.println("List 2:");
        printList(head2);

        // Merge the lists
        Node mergedHead = mergeLists(head1, head2);

        System.out.println("Merged List:");
        printList(mergedHead);
    }
}

