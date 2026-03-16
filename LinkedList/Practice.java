package LinkedList;

import java.util.*;

public class Practice {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        tail = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Practice ll = new Practice();

        System.out.println("enter the no. of elements you want to add in the ll : ");

        int n = sc.nextInt();

        System.out.println("Enter the elements in the linked list : ");

        for (int i = 0; i < n; i++) {
            ll.addLast(sc.nextInt());
        }

        ll.printList();

        sc.close();
    }
}
