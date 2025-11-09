// ===========================
//  Binary Search Tree Traversal
// ===========================
//
// This program demonstrates how to:
// 1. Create a Binary Search Tree (BST)
// 2. Insert nodes into the tree
// 3. Traverse it in three different orders:
//      - Preorder (Root → Left → Right)
//      - Inorder  (Left → Root → Right)
//      - Postorder(Left → Right → Root)
//
// Note: Traversal means visiting each node exactly once in a specific order.


// ---------------------------
// Node class (Blueprint of each tree node)
// ---------------------------
class BSTNode {
    int data;        // The value stored in the node
    BSTNode left;    // Reference (pointer) to the left child
    BSTNode right;   // Reference (pointer) to the right child

    // Constructor: called when a new node is created
    BSTNode(int value) {
        data = value;
        left = null;
        right = null;
    }

    // Just to print node data easily
    @Override
    public String toString() {
        return Integer.toString(data);
    }
}


// ---------------------------
// Main BST class
// ---------------------------
public class BinarySearchTreeTraversal {

    // Function to insert a new node in the BST
    // Remember: In BST, left < root < right
    public static void insertNode(BSTNode rootNode, int nodeValue) {
        BSTNode current = rootNode;  // Start from root

        while (true) {
            // If value is smaller, go to LEFT subtree
            if (nodeValue <= current.data) {
                if (current.left == null) {
                    current.left = new BSTNode(nodeValue);
                    break; // Stop once inserted
                } else {
                    current = current.left; // Move left
                }
            }

            // If value is greater, go to RIGHT subtree
            else {
                if (current.right == null) {
                    current.right = new BSTNode(nodeValue);
                    break;
                } else {
                    current = current.right; // Move right
                }
            }
        }
    }


    // ---------------------------
    // Tree Traversal Functions
    // ---------------------------

    // 1. Preorder Traversal (Root → Left → Right)
    public static void preorderTraversal(BSTNode node) {
        if (node == null) return;  // Base case

        System.out.print(node.data + " "); // Visit root
        preorderTraversal(node.left);      // Visit left subtree
        preorderTraversal(node.right);     // Visit right subtree
    }

    // 2. Inorder Traversal (Left → Root → Right)
    // Gives elements in sorted order for BST!
    public static void inorderTraversal(BSTNode node) {
        if (node == null) return;

        inorderTraversal(node.left);       // Visit left subtree
        System.out.print(node.data + " "); // Visit root
        inorderTraversal(node.right);      // Visit right subtree
    }

    // 3. Postorder Traversal (Left → Right → Root)
    public static void postorderTraversal(BSTNode node) {
        if (node == null) return;

        postorderTraversal(node.left);     // Visit left subtree
        postorderTraversal(node.right);    // Visit right subtree
        System.out.print(node.data + " "); // Visit root
    }


    // ---------------------------
    // Main Function
    // ---------------------------
    public static void main(String[] args) {

        // Create a root node
        BSTNode root = new BSTNode(10);

        // Insert more nodes
        insertNode(root, 15);
        insertNode(root, 2);
        insertNode(root, 12);
        insertNode(root, 18);

        // Print all traversals
        System.out.print("Preorder Traversal (Root Left Right): ");
        preorderTraversal(root);

        System.out.print("\nInorder Traversal (Left Root Right): ");
        inorderTraversal(root);

        System.out.print("\nPostorder Traversal (Left Right Root): ");
        postorderTraversal(root);
    }
}
