package StrukturData.Modul5.codlab;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

class BinaryTree {
    public Node root;

    public BinaryTree() {
        root = null;
    }

    public void addroot(int data) {
        root = new Node(data);
    }

    public void inOrder(Node node){
        if(node != null){
            inOrder((node.left));
            System.out.println(node.data + "");
            inOrder((node.right));
        }
    }

    public void preOder(Node node){
        if(node != null){
            System.out.println(node.data + "");
            preOder(node.left);
            preOder(node.right);
        }
    }

    public void postOrder(Node node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data + "");
            
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.addroot(20);
        tree.root.left = new Node(2);
        tree.root.right = new Node(25);
        tree.root.left.left = new Node(37);
        tree.root.left.right = new Node(12);
        tree.root.right.right = new Node(16);

        System.out.println("\nPre Orderr: ");
        tree.preOder(tree.root);
        System.out.println("\nIn Order: ");
        tree.inOrder(tree.root);
        System.out.println("\nPost Order: ");
        tree.postOrder(tree.root);

    }

    public void newNode(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'newNode'");
    }

    public void preOrder(Node root2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'preOrder'");
    }
}
