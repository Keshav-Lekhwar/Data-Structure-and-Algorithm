import java.util.*;




public class Hight {

    Node root;

    public Node insert(Node root, int data) {

        if (root == null)
            return new Node(data);

        if (root.data < data)
            root.right = insert(root.right, data);

        else if (root.data > data)
            root.left = insert(root.left, data);

        return root;

    }


    public int getHight(Node root){

        if(root == null){
            return 0;
        }

        int left = getHight(root.left);
        int  right = getHight(root.right);

        return Math.max(left, right)+1;

    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        obj.nextLine();

        int num[] = new int[n];

        for (int i = 0; i < num.length; i++) {

            num[i] = obj.nextInt();
        }

        Hight nobj = new Hight();

        for (int j : num) {
            
            nobj.root = nobj.insert(nobj.root, j);   
        }

        
        int hight = nobj.getHight(nobj.root);

        System.out.println(hight-1);

         



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
