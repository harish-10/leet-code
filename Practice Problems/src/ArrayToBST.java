//Link to the problem statement : https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

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

public class ArrayToBST {
    
    private TreeNode convertArrayToBST(int left,int right, int[] nums){
        
        if(left>right){
            return null;
        }
        
        int mid=(left+right)/2;
        
        TreeNode node=new TreeNode(nums[mid]);
        
        if(left==right){
            return node;
        }
        
        node.left=convertArrayToBST(left,mid-1, nums);
        node.right=convertArrayToBST(mid+1,right, nums);
        
        return node;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        return convertArrayToBST(0,nums.length-1,nums);
        
    }
}

