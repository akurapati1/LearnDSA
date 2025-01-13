class Node {
    int data;
     Node next;
     Node(int d)  { data = d;  next = null; }
 }

public class SearchInLinkedList {
    
    static boolean searchKey(int n, Node head, int key) {
        if(head == null) return false;
        
        Node current = head;
        
        while(current.next != null){
            if(current.data == key) return true;
            else current = current.next;
            
        }
        
        return false;
    }
}
