import java.util.LinkedList;

class node {
    node left;
    node right;
    int data;

    node(int data) {
        this.data = data;
    }

}

public class BT {

    node root;

    public void insert(int val) {

        node newnode = new node(val);
        LinkedList<node> q = new LinkedList<>();
        if (root == null){
            root = newnode;
            return;

        }
            
        q.offer(root);

        while (!q.isEmpty()) {

            node temp = q.poll();

            if (temp.left == null) {

                temp.left = newnode;
                return;
            }
            else{
                q.offer(temp.left);
            }

            if (temp.right == null) {
                temp.right = newnode;
                return;
            }
            else {
                q.offer(temp.right);
                
            }

        }
    }

    public static void Display(node root){

        if(root==null) return ;

        Display(root.left);
        System.out.println(root.data);
        Display(root.right);


    }

    public static void main(String[] args) {

        BT obj = new BT();

       obj.insert(10);
       obj.insert(20);
       obj.insert(30);
       obj.insert(40);
       obj.insert(60);
       obj.insert(100);

        Display(obj.root);


    }

}
