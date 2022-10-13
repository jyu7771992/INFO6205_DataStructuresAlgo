package Tree;

import java.lang.reflect.Array;
import java.util.*;

//https://leetcode.com/problems/binary-tree-vertical-order-traversal/
class Solution1{
    public List<List<Integer>> verticalOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        //base case
        if(root == null){
            return res;
        }

        //use map store the column and node.val
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> cols = new LinkedList<>();
        //initialize the queue and cols
        q.add(root);
        cols.add(0);
        //initialize min and max: min for left side, max for right side
        int min = 0;
        int max = 0;

        while(!q.isEmpty()){
            TreeNode node = q.poll();
            int col = cols.poll();

            if(!map.containsKey(col)){
                map.put(col, new ArrayList<Integer>());
            }
            map.get(col).add(node.val); // get the same col and add the value in the arrayList

            if(node.left != null){
                q.add(node.left);
                cols.add(col - 1);
                min = Math.min(min, col - 1);
            }

            if(node.right != null){
                q.add(node.right);
                cols.add(col + 1);
                max = Math.max(max, col + 1);
            }
        }

        for(int i = min; i <= max; i++){
            res.add(map.get(i));
        }
        return res;
    }
}
