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
    TreeNode fun(TreeNode tptr,int val)
    {
        if(tptr==null) return tptr;
        if(tptr.val==val)
        {
            return tptr;
        }
        if(tptr.val>val) return fun(tptr.left,val);
        return fun(tptr.right,val);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return fun(root,val);
    }
}