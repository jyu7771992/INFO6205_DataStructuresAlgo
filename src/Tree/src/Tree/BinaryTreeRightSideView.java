package Tree;

import apple.laf.JRSUIUtils;
import com.sun.jmx.remote.internal.ArrayQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;


// Java Program Demonstrate offer()
// method of Queue


//one queue + level size measurements
//https://leetcode.com/problems/binary-tree-right-side-view/
class Solution8 {
    public List<Integer> rightSideView(TreeNode root) {
        //find the tree
        //edge case
        if(root == null) return new ArrayList<Integer>();
        ArrayDeque<TreeNode> queue = new ArrayDeque(){{ offer(root); }};
        List<Integer> rightside = new ArrayList<>();

        while(!queue.isEmpty()){
            int levelLength = queue.size();

            for(int i = 0; i < levelLength; i++){
                TreeNode node = queue.poll();
                // check if the node is the last one
                if(i == levelLength - 1){
                    rightside.add(node.val);
                }
                //add the left child and right child in th queue
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
        }
        return rightside;
    }
}
