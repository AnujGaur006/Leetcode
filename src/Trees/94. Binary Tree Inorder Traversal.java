package Trees;

import java.util.ArrayList;
import java.util.List;

class InOrderTraversal {
    List<Integer> result = new ArrayList<>();

    public List<Integer> inorderRecursive(TreeNode root) {
        if(root == null)
            return result;

        inorder(root);

        return result;
    }

    public void inorder(TreeNode node){
        if(node != null){
            inorder(node.left);
            result.add(node.val);
            inorder(node.right);
        }
    }
}
