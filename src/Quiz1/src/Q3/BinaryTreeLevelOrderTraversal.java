package Q3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution2{
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelRes = new ArrayList<>();
        if (root == null) return levelRes;

        Queue<TreeNode> queuePack = new LinkedList<TreeNode>();
        queuePack.add(root);
        int curlevel = 0;
        //check if queue is empty or not
        while ( !queuePack.isEmpty() ) {
            //define new array in the res to start
            levelRes.add(new ArrayList<Integer>());
            int level_length = queuePack.size(); // define the current length of currentLevel
            //go through the current queue
            for(int i = 0; i < level_length; i++) {
                TreeNode node = queuePack.remove();
                levelRes.get(curlevel).add(node.val);
                //if node.left s not null, push it into queuePack
                if (node.left != null) queuePack.add(node.left);
                //if node.right s not null, push it into queuePack
                if (node.right != null) queuePack.add(node.right);
          }
            curlevel++;
        }
        //return the final result
        return levelRes;
    }
}

