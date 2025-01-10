
class Node {
    int data;
    Node next;

    Node() { data = 0; }
    Node(int d) { data = d; }  //constructor to create a new node
}

public class ArrayToLinkedList {
    
    static Node constructLL(int arr[]) {
        
        if(arr == null || arr.length ==0){
            return null;
        }
        
        Node head = new Node(arr[0]);
        Node start = head;
        
        for(int i=1; i<arr.length; i++){
            start.next = new Node(arr[i]);
            start = start.next;
        }
        
        return head;
    }
    
}
