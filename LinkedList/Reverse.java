package LinkedList;

public class Reverse {
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
        newNode.next = head;
        head = newNode;
    }
    
    public void printList(){
        if(head == null){
            System.out.println("the list is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    
    public static void main(String args[]){
        Reverse ll = new Reverse();
        
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(9);
        ll.addFirst(11);

        System.out.println("Before Reversing : ");
        ll.printList();
        
        ll.reverse();

        System.out.println("After Reversing :");
        ll.printList();
        
    }
}
