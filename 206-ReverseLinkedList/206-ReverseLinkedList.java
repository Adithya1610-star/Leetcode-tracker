// Last updated: 7/9/2026, 9:15:24 AM
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
    public ListNode reverseList(ListNode head) {
        
        ListNode adiabi = null;
        ListNode node = null;
        ListNode curr = head;

        while(curr != null)
        {
            node = curr.next;

            curr.next = adiabi;

            adiabi = curr;
            curr = node;
        }

        return adiabi;
    }
}