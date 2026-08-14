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
    public long kthLargestLevelSum(TreeNode root, int k) {
        int h=height(root);
        long arr[]=new long[h];
        sum(root,arr,0);
        Arrays.sort(arr);
        if(arr.length-k>=0)
        return arr[arr.length-k];
        return -1;
    }
    int height(TreeNode root){
        if(root==null)
        return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    void sum(TreeNode root,long arr[],int k){
        if(root==null)
        return;
        arr[k]+=root.val;
        sum(root.left,arr,k+1);
        sum(root.right,arr,k+1);
    }
}