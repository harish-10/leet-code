//Link to problem statement : https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/ 

import java.util.ArrayList;
import java.util.List;

/**
  Definition for singly-linked list.
 **/ 
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
/**
 * Definition for a binary tree node.
 * */
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
public class ListToBST {
    private List<Integer> values;
    
    public ListToBST(){
        this.values=new ArrayList<Integer>();
    }
    
    private void mapToList(ListNode head){
        while(head!=null){
            this.values.add(head.val);
            head=head.next;
        }
    }
    private TreeNode convertListToBST(int left, int right){
        
        if(left>right){
            return null;
        }
        
        int mid=(left+right)/2;
        TreeNode node=new TreeNode(this.values.get(mid));
        
        if(left==right){
            return node;
        }
        
        node.left=convertListToBST(left,mid-1);
        node.right=convertListToBST(mid+1,right);
        
        return node;
        
    }
    public TreeNode sortedListToBST(ListNode head) {
        
        this.mapToList(head);
        return convertListToBST(0,this.values.size()-1);
        
        
        
    }
}

