/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int prev = -1;   // persists across recursion

    int fun(TreeNode tptr, int min) {
        if (tptr == null) return min;

        // LEFT
        min = fun(tptr.left, min);

        // NODE
        int val = tptr.val;
        if (prev != -1) {
            min = Math.min(min, Math.abs(val - prev));
        }
        prev = val;

        // RIGHT
        min = fun(tptr.right, min);

        return min;
    }

    public int getMinimumDifference(TreeNode root) {
        int min = 100001;
        return fun(root, min);
    }
}
