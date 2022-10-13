package Tree;

import java.util.LinkedList;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/
//stack data structure: first in last out
class Solution {
    public int maxDepth(TreeNode root) {
       //base case
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        //return the depth and the root itself
        return Math.max(left, right) + 1;
    }
}
