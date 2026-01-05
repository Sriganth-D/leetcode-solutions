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
    ArrayList<Integer> fun(TreeNode tptr,ArrayList<Integer> lst)
    {
        if(tptr==null) return lst;
        int data = tptr.val;
        lst.add(data);
        fun(tptr.left,lst);
        fun(tptr.right,lst);
        return lst;
    }
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst = fun(root,lst);
        int[] arr = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) 
        {
            arr[i] = lst.get(i);
        }
        Arrays.sort(arr);
int min = arr[0];

for (int i = 1; i < arr.length; i++) {
    if (arr[i] > min) {
        return arr[i];
    }
}


        
        return -1;
    }
}