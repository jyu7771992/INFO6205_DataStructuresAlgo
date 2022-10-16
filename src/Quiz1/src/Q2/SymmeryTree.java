package Q2;

import Q3.TreeNode;
class Solution3{

    public boolean isSymmetric(TreeNode root) {
        return checkMirror(root, root);
    }
    //check the left subtree and the right subtree
    public boolean checkMirror(TreeNode tree1, TreeNode tree2) {
        // base case for tree1 and tree 2, if they don't have different value and they go through the end of the tree
        if (tree1 == null && tree2 == null){
            return true;
        }
        //if one of them are not symmertry
        if (tree1 == null || tree2 == null){
            return false;
        }
        //check 1: both values are the same,
        // 2: go through the right value of left subtree and the left value of right subtree
        // 3: go through the left value of left subtree and the right value of right subtree
        return (tree1.val == tree2.val)
                && checkMirror(tree1.right, tree2.left)
                && checkMirror(tree1.left, tree2.right);
    }
}

