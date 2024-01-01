package Trees;

import java.util.Queue;
import java.util.LinkedList;

public class MaxDepth {
    public int maxDepth(TreeNode root) {

         // recursive approach
        /*
         if(root == null)
             return 0;
         else return 1 + Math.max(maxDepth(root.left), maxDepth(root.right)); */

        int ans =0;
        if(root == null)
            return ans;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty())
        {
            int level = queue.size();
            ans++;
            for(int i=0; i< level; i++)
            {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);

                queue.poll();
            }
        }

        return ans;
    }
}
