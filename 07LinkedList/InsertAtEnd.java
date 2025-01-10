
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

public class InsertAtEnd {
    
    Node insertAtEnd(Node head, int x) {
        if(head == null) return head = new Node(x);
        
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        
        current.next = new Node(x);
        return head;
    }
}
