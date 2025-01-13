
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
   
}

public class DeleteNode {
    
    public void deleteNode(ListNode node) {
        if(node == null) return ;

        ListNode current = node;
        while(current.next.next != null){
            current.val = current.next.val;
            current = current.next;

        }
        current.val = current.next.val;
        current.next = null;
    }
}
