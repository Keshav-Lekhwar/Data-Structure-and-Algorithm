
class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

class BST {

    Node root;

    public Node insert(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }

       
        if (value < root.data) {
            root.left = insert(root.left, value);
        }

        else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        System.out.println(root.data);

        return root;
    }

    public void Display(Node root) {

        if (root == null)
            return;
        try {
            Display(root.left);
            System.out.println(root.data);
            Display(root.right);

        } catch (Exception e) {
            System.out.println("kuch gadbad ho gya hai ." + e.getMessage());
        }
    }

    public Node inorderSuccessor(Node root, Node p) {
        Node successor = null;

        while (root != null) {
            if (p.data < root.data) {
                successor = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return successor;
    }

    public static void main(String[] args) {

        BST tree = new BST();

        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 80);
        tree.insert(tree.root, 90);

        // tree.Display(tree.root);
        Node temp = new Node(80);
        // Node suc = tree.inorderSuccessor(tree.root, temp);
        // System.out.println(suc.data);
    }
}