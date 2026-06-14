import java.util.*;




public class BFS {

 Node root;

    void insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp.left == null) {
                temp.left = newNode;
                return;
            } else {
                queue.offer(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                return;
            } else {
                queue.offer(temp.right);
            }
        }
    }
    
    ArrayList<Integer> list = new ArrayList<>();

      public void leftside(Node root){

          if(root==null) return  ;
      
            leftside(root.left);
            list.add(root.data);
            
            
        }
        public void righside(Node root){

            if(root==null) return;

            list.add(root.data);
            righside(root.right);

        }

      public void  topview(Node root){

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

      }

  
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        obj.nextLine();

        int num[] = new int[n];
         BFS nobj = new BFS();

        for (int i = 0; i < num.length; i++) {

            nobj.insert(obj.nextInt());
        }

       

       

        nobj.leftside(nobj.root);
        nobj.righside(nobj.root.right);

        
       nobj.topview(nobj.root);

      


    }
    

}


class Node {

    Node left;
    Node right;
    int data;

    Node(int data) {

        this.left = null;
        this.right = null;
        this.data = data;

    }
}
