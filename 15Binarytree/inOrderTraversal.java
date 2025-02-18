import java.util.ArrayList;

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}

class inOrderTraversal {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        
        ArrayList<Integer> result = new ArrayList();
        
        return traversal(result, root);
        
        
    }
    
    ArrayList<Integer> traversal(ArrayList<Integer> result, Node node){
        
        if (node != null) {
            traversal(result, node.left);  // Traverse left subtree
            result.add(node.data);         // Visit the node
            traversal(result, node.right); // Traverse right subtree
        }
            
        return result;
                
    }
    
}