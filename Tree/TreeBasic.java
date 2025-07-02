
import java.util.Scanner;


class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
       
    }
}

class TreeBasic{
    Scanner sc = new Scanner(System.in);
    static TreeNode createTree(){
        System.out.println("Enter data for the node (-1 for no node): ");
        int data = new Scanner(System.in).nextInt();
        if(data == -1){
            return null;
        }
        TreeNode node = new TreeNode(data);
        System.out.println("Enter left child of " + data);
        node.left = createTree();
        System.out.println("Enter right child of " + data);
        node.right = createTree();
        return node;

    }

    static void preOrder(TreeNode root){
        if(root == null) {
            return;
        }
        // Depth First Traversal (DFT) Pre-order Traversal
        System.out.println( root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

       static void inOrder(TreeNode root){
        if(root == null) {
            return;
        }
        // Depth First Traversal (DFT) Pre-order Traversal
        
        inOrder(root.left);
        System.out.println( root.data);
        inOrder(root.right);
    }

    static void postOrder(TreeNode root){
        if(root == null) {
            return;
        }
        // Depth First Traversal (DFT) Pre-order Traversal
        postOrder(root.left);
        postOrder(root.right);
        
        System.out.println( root.data);
       
    }
    
     static void formattedTree(TreeNode root, String prefix, boolean isLeft) {
        if(root == null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + "null");
            return;
        }
        // Depth First Traversal (DFT) Pre-order Traversal
        System.out.println( prefix + (isLeft ? "├── " : "└── ") + root.data);
        formattedTree(root.left, prefix + (isLeft? "|" : ""), true);
        formattedTree(root.right, prefix + (isLeft? "|" : ""), false);
    
    }

    static void levelOrder(TreeNode root){
        if(root == null) {
            return;
        }
        // Level Order Traversal (BFS)
        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");
            if(current.left != null) {
                queue.add(current.left);
            }
            if(current.right != null) {
                queue.add(current.right);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        TreeNode root = createTree();
        levelOrder(root);
        // printTree(root);
        // formattedTree(root, " ", true);
        // TreeNode root = new TreeNode(10);
        // TreeNode leftChild = new TreeNode(5);
        // TreeNode rightChild = new TreeNode(15);
        // root.left = leftChild;
        // root.right = rightChild;
        // TreeNode leftChild1 = new TreeNode(3);


    }
}