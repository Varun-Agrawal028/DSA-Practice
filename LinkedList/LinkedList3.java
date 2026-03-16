package LinkedList;

public class LinkedList3 {
    public static class Node {
        int data;
        Node next;
        
        private Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    
    public Node createNode(int data){
        return new Node(data);
    }
    
    public Node getHead(){
        return head;
    }
    
    public void setHead(Node head){
        this.head = head;
    }
    
    public Node getTail(){
        return tail;
    }
    
    public void setTail(Node tail){
        this.tail = tail;
    }
    
    public void addFirst(int data){
        Node newNode = createNode(data);
        
        if(getHead() == null){
            setHead(newNode);
            setTail(newNode);
            return;
        }
        
        newNode.next = getHead();
        setHead(newNode);
    }
    
    public static void main(String args[]){
        LinkedList3 ll = new LinkedList3();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
    }
}
