import javax.swing.tree.TreeNode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xuyan
 * @Date: 2023-02-12
 * @Time: 20:32
 */
public class BinaryTree<pubilc> {
    TreeNode root;
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public BinaryTree(int data) {
        root = new TreeNode(data);
    }

    /**
     * 获取二叉树节点个数
     * @param current
     * @return
     */
    public int size(TreeNode current) {
        return sizeRecursive(current);
    }

    private int sizeRecursive(TreeNode current) {
        if (root == null) {
            return 0;
        }
        int leftSize = size(root.left);
        int rightSize = size(root.right);
        return leftSize+rightSize+1;
    }

    // Insert a new node in the binary tree
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private TreeNode insertRecursive(TreeNode current, int data) {
        if (current == null) {
            return new TreeNode(data);
        }
        if (data < current.val) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.val) {
            current.right = insertRecursive(current.right, data);
        } else {
            // value already exists
            return current;
        }
        return current;
    }

    // Search for a node in the binary tree
    public boolean search(int data) {
        return searchRecursive(root, data);
    }

    private boolean searchRecursive(TreeNode current, int data) {
        if (current == null) {
            return false;
        }
        if (data == current.val) {
            return true;
        }
        return data < current.val
                ? searchRecursive(current.left, data)
                : searchRecursive(current.right, data);
    }

    // Delete a node from the binary tree
    public void delete(int data) {
        root = deleteRecursive(root, data);
    }

    private TreeNode deleteRecursive(TreeNode current, int data) {
        if (current == null) {
            return null;
        }
        if (data == current.val) {
            // Node to be deleted found
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
            int smallestValue = findSmallestValue(current.right);
            current.val = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if (data < current.val) {
            current.left = deleteRecursive(current.left, data);
            return current;
        }
        current.right = deleteRecursive(current.right, data);
        return current;
    }

    private int findSmallestValue(TreeNode root) {
        return root.left == null ? root.val : findSmallestValue(root.left);
    }

    // Pre-order traversal
    public void preOrderTraversal() {
        preOrderTraversalRecursive(root);
    }

    private void preOrderTraversalRecursive(TreeNode current) {
        if (current != null) {
            System.out.print(current.val + " ");
            preOrderTraversalRecursive(current.left);
            preOrderTraversalRecursive(current.right);
        }
    }

    // In-order traversal
    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }

    private void inOrderTraversalRecursive(TreeNode current) {
        if (current != null) {
            inOrderTraversalRecursive(current.left);
            System.out.print(current.val + " ");
            inOrderTraversalRecursive(current.right);
        }
    }

    // Post-order traversal
    public void postOrderTraversal() {
        postOrderTraversalRecursive(root);
    }

    private void postOrderTraversalRecursive(TreeNode current) {
        if (current != null) {
            postOrderTraversalRecursive(current.left);
            postOrderTraversalRecursive(current.right);
            System.out.print(current.val + " ");
        }
    }
}


