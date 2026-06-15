import java.util.LinkedList;
import java.util.Queue;

class Node {

    Node left;
    Node right;
    int data;
    Node(int data){

        this.data = data;

    }
    
}


public class BTree {
    Node root;


    
    public void insert(int data){
        
        Node newnode = new Node(data);

        if(root==null){
            root = newnode;
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            Node temp = q.poll();

            if(temp.left==null){

                temp.left = newnode;
                return;
            }
            else{
                q.offer(temp.left);

            }

        if(temp.right == null){

            temp.right = newnode;
            return;
        }
        else{
            q.offer(temp.right);
        }
            
        }
    }



// Depth First Search ( preorder, postorder, inorder)

 public void preorder(Node root) {

    if (root == null) 
        return;
    

    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
}


public void inorder(Node root) {

    if (root == null) 
        return;
    

    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
}


public void postorder(Node root) {

    if (root == null) 
        return;
    

    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
}



//Breadth-First Search or Level Order printing 

public void levelOrder(Node root) {

    if (root == null)  return;
    
    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {

        Node current = queue.poll();

        System.out.print(current.data + " ");

        if (current.left != null)  queue.offer(current.left);
        
        if (current.right != null) queue.offer(current.right);
        
    }
}
    
    public static void main(String[] args) {

        BTree obj = new BTree();
        
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);

        obj.levelOrder(obj.root);
        
    }
}
