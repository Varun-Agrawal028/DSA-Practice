package LinkedList;

public class DeleteNthFromEnd {
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
    
    public void deleteNthFromEnd(int n){
        //calculate size
        int size = 0;
        Node temp = head;

        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(n == size){        //case - remove head
            head = head.next;
            return;
        }


        //size-n
        int i=1;
        Node prev = head;
        int idxToFind = size-n;
        while(i < idxToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }


    public static void main(String args[]){
        DeleteNthFromEnd ll = new DeleteNthFromEnd();
        
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(9);
        ll.addFirst(11);

        ll.printList();

        ll.deleteNthFromEnd(3);
        ll.printList();
    }
}
