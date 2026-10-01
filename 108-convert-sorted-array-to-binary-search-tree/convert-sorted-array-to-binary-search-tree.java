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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=find(nums,0,nums.length-1);
        return root;
    }
    TreeNode find(int arr[],int start,int end){
        int mid=(start+end+1)/2;
        TreeNode node=new TreeNode();
        node.val=arr[mid];
        if(mid==start)
        node.left=null;
        else
        node.left=find(arr,start,mid-1);
        if(mid==end)
        node.right=null;
        else
        node.right=find(arr,mid+1,end);
        return node;
    }
}