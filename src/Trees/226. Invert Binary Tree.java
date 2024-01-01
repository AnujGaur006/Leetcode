package Trees;

class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        TreeNode node = null;

        if(root == null){
            return null;
        } else {
            node = root.left;
            root.left = root.right;
            root.right = node;
        }

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    // elements are printed in increasing order for in order traversal
    public void inorderTraversal(TreeNode root){
         if(root != null){
             inorderTraversal(root.left);
             System.out.println(root.val);
             inorderTraversal(root.right);
         }
    }


    public void preorderTraversal(TreeNode root){
        if(root != null){
            System.out.println(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public void postorderTraversal(TreeNode root){
        if(root != null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.println(root.val);
        }
    }
}
