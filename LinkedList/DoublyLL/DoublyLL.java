package LinkedList.DoublyLL;

public class DoublyLL {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }

        if(head == tail){
            int val = head.data;
            head = tail = null;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;

        return val;
    }

    public int removeLast(){
        if(head == null){
            System.out.println("list is empty");
        }

        if(head == tail){
            int val = head.data;
            head = tail = null;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;

        return val;
    }

    public void reverseLL(){

    }

    public void print(){
        if(head == null){
            System.out.println("the list is empty");
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reversePrint() {
        if (tail == null) {
            System.out.println("The list is empty");
            return;
        }

        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null (head)");
    }

    public static void main(String args[]){
        DoublyLL ll = new DoublyLL();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.print();
        ll.reversePrint();

        int val = ll.removeFirst();
        ll.print();
        System.out.println(val);

        int val2 = ll.removeLast();
        ll.print();
        System.out.println(val2);
    }
}
