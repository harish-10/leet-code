//Link to the problem statement : https://leetcode.com/problems/merge-k-sorted-lists/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MergeKList {
    private ListNode mergeTwoLists(ListNode node1, ListNode node2){
        ListNode temp=new ListNode(0);
        ListNode result=temp;
        while(node1!=null && node2!=null){
        if(node1.val<node2.val){
            temp.next=node1;
            temp=temp.next;
            node1=node1.next;
        }
        else{
            temp.next=node2;
            temp=temp.next;
            node2=node2.next;
        }
            
      }
        
        if(node1==null){
            temp.next=node2;
        }
        if(node2==null){
            temp.next=node1;
        }       
        
        return result.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
       if(lists.length==1){
        return lists[0];
    }
    if(lists.length==0){
        return null;
    }
    ListNode head = mergeTwoLists(lists[0],lists[1]);
    for (int i = 2; i < lists.length; i++) {
        head = mergeTwoLists(head,lists[i]);
    }
    return head;
    }
}

