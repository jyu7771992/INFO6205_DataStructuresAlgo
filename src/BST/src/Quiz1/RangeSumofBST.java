package Quiz1;

import java.util.Stack;
class TreeNodeTwo {
    int val;
    TreeNodeTwo left;
    TreeNodeTwo right;
    TreeNodeTwo() {}
    TreeNodeTwo(int val) { this.val = val; }
    TreeNodeTwo(int val, TreeNodeTwo left, TreeNodeTwo right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution5 {
    public int rangeSumBST(TreeNodeTwo root, int low, int high) {
        int ans = 0;
        Stack<TreeNodeTwo> stack = new Stack();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNodeTwo node = stack.pop();
            if (node != null) {
                if (low <= node.val && node.val <= high)
                    ans += node.val;
                if (low < node.val)
                    stack.push(node.left);
                if (node.val < high)
                    stack.push(node.right);
            }
        }
        return ans;
    }
}

