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
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null)
        return head;
        if(head.next==null)
        return head;
        else
        {
            ListNode curr=head.next.next;
            ListNode prv=head;
            head=head.next;
            head.next=prv;
            while(curr!=null && curr.next!=null)
            {
                prv.next=curr.next;
                prv=curr;
                ListNode next=curr.next.next;
                curr.next.next=curr;
                curr=next;
            }
            prv.next=curr;
            return head;
        }
        
    }
}