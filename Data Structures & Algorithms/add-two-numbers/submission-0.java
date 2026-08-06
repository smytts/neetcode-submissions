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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode dummy = new ListNode();
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int var1 = (l1 != null) ? l1.val : 0;
            int var2 = (l2 != null) ? l2.val : 0;
            int val = var1 + var2 + carry;
            carry = val / 10;
            val = val % 10;
            current.next = new ListNode(val);
            // update pointers
            current = current.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        return dummy.next;
    }
}
