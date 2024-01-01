package Trees;

public class TreeNode {
    int val;
    Trees.TreeNode left;
    Trees.TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, Trees.TreeNode left, Trees.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
