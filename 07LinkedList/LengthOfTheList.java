class Node{
    int data;
    Node next;

    Node(int a){
        this.data = a;
        this.next = null;
    }
} 

public class LengthOfTheList {
    
    public int getCount(Node head) {
        Node current = head;
        int count =0;
        while(current.next != null){
            count+=1;
            current = current.next;
        }
        
        return count+1;
    }
}
