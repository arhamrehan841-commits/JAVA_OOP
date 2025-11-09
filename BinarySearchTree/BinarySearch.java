// ===========================
//  Binary Search in a BST
// ===========================
//
// This program focuses only on **searching** for a value inside a BST.
// It uses the BST property to make search faster than normal traversal.
//
// In a BST:
//    - Left child always has smaller value than parent
//    - Right child always has larger value than parent
//
// So instead of checking every node, we can skip half of the tree each step.
// Time Complexity: O(log n)


// ---------------------------
// Node class (same as before)
// ---------------------------
class BSTNode {
    int data;
    BSTNode left;
    BSTNode right;

    BSTNode(int value) {
        data = value;
        left = null;
        right = null;
    }
}


// ---------------------------
// Main BST Search class
// ---------------------------
public class BinarySearch {

    // Insert new nodes into BST
    public static void insertNode(BSTNode rootNode, int nodeValue) {
        BSTNode current = rootNode;

        while (true) {
            if (nodeValue <= current.data) {
                if (current.left == null) {
                    current.left = new BSTNode(nodeValue);
                    break;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = new BSTNode(nodeValue);
                    break;
                } else {
                    current = current.right;
                }
            }
        }
    }

    // ---------------------------
    // Binary Search Function
    // ---------------------------
    public static boolean searchBST(BSTNode node, int value) {
        // Base case: empty tree
        if (node == null) {
            return false;
        }

        // If current node matches, we found it
        if (node.data == value) {
            return true;
        }

        // If value is smaller, search in left subtree
        if (value < node.data) {
            return searchBST(node.left, value);
        }

        // If value is larger, search in right subtree
        else {
            return searchBST(node.right, value);
        }
    }


    // ---------------------------
    // Main Function
    // ---------------------------
    public static void main(String[] args) {

        // Create a root node
        BSTNode root = new BSTNode(10);

        // Insert few nodes
        insertNode(root, 15);
        insertNode(root, 2);
        insertNode(root, 12);
        insertNode(root, 18);

        // Search for values
        System.out.println("Searching for 15: " + searchBST(root, 15));
        System.out.println("Searching for 5: " + searchBST(root, 5));
    }
}
