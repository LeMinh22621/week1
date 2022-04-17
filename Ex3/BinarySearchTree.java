public class BinarySearchTree {
    private Tu value;
    private BinarySearchTree lNode;
    private BinarySearchTree rNode;

    public Tu getValue()
    {
        return this.value;
    }
    public BinarySearchTree(Tu value)
    {
        this.value = value;
        this.lNode = null;
        this.rNode = null;
    }
    public void insert(Tu value)
    {
        if(this.value.getTu() == null)
        {
            this.value = value;
            this.lNode = null;
            this.rNode = null;
            return;
        }
        if(this.value.getTu().compareTo(value.getTu()) == 1)
        {
            if(this.lNode == null)
                this.lNode = new BinarySearchTree(value);
            else
                this.lNode.insert(value);
        }
        else if(this.value.getTu().compareTo(value.getTu()) == -1)
        {
            if(this.rNode == null)
                this.rNode = new BinarySearchTree(value);
            else
                this.rNode.insert(value);
        }
    }

    public BinarySearchTree searchNode(String value)
    {
        BinarySearchTree result = null;
        if(this.value == null)
            return null;
        if(this.lNode != null)
            result = this.lNode.searchNode(value);
        if(result == null && this.rNode != null)
            result = this.rNode.searchNode(value);
        return result;
    }

    public void displayLNR()
    {
        if(this.lNode != null)
            this.lNode.displayLNR();
        this.value.xuat();
        if(this.rNode != null)
            this.rNode.displayLNR();
    }
}
// class BinarySearchTree {
//     class Node {
//       Tu key;
//       Node left, right;
  
//       public Node(Tu item) {
//         key = item;
//         left = right = null;
//       }
//     }
  
//     Node root;
  
//     BinarySearchTree() {
//       root = null;
//     }
  
//     void insert(Tu key) {
//       root = insertKey(root, key);
//     }
  
//     // Insert key in the tree
//     Node insertKey(Node root, Tu key) {
//       // Return a new node if the tree is empty
//       if (root == null) {
//         root = new Node(key);
//         return root;
//       }
  
//       // Traverse to the right place and insert the node
//       if (key.getTu().compareTo(root.key.getTu()) == -1)
//         root.left = insertKey(root.left, key);
//       else if (key.getTu().compareTo(root.key.getTu()) == 1)
//         root.right = insertKey(root.right, key);
  
//       return root;
//     }
  
//     void inorder() {
//       inorderRec(root);
//     }
  
//     // Inorder Traversal
//     void inorderRec(Node root) {
//       if (root != null) {
//         inorderRec(root.left);
//         root.key.xuat();
//         inorderRec(root.right);
//       }
//     }
  
//     void deleteKey(Tu key) {
//       root = deleteRec(root, key);
//     }
  
//     Node deleteRec(Node root, Tu key) {
//       // Return if the tree is empty
//       if (root == null)
//         return root;
  
//       // Find the node to be deleted
//       if (key.getTu().compareTo(root.key.getTu()) == -1)
//         root.left = deleteRec(root.left, key);
//       else if (key.getTu().compareTo(root.key.getTu()) == 1)
//         root.right = deleteRec(root.right, key);
//       else {
//         // If the node is with only one child or no child
//         if (root.left == null)
//           return root.right;
//         else if (root.right == null)
//           return root.left;
  
//         // If the node has two children
//         // Place the inorder successor in position of the node to be deleted
//         root.key = minValue(root.right);
  
//         // Delete the inorder successor
//         root.right = deleteRec(root.right, root.key);
//       }
  
//       return root;
//     }
  
//     // Find the inorder successor
//     Tu minValue(Node root) {
//       Tu minv = root.key;
//       while (root.left != null) {
//         minv = root.left.key;
//         root = root.left;
//       }
//       return minv;
//     }
  
//     // Driver Program to test above functions
//     // public static void main(String[] args) {
//     //   BinarySearchTree tree = new BinarySearchTree();
  
//     //   tree.insert(8);
//     //   tree.insert(3);
//     //   tree.insert(1);
//     //   tree.insert(6);
//     //   tree.insert(7);
//     //   tree.insert(10);
//     //   tree.insert(14);
//     //   tree.insert(4);
  
//     //   System.out.print("Inorder traversal: ");
//     //   tree.inorder();
  
//     //   System.out.println("\n\nAfter deleting 10");
//     //   tree.deleteKey(10);
//     //   System.out.print("Inorder traversal: ");
//     //   tree.inorder();
//     // }
//   }