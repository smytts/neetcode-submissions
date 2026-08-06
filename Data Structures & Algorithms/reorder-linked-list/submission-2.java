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
    public void reorderList(ListNode head) {
          int size = getSize(head);
        int[] array = new int[size];
        ListNode front = head, back = null;

        
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                if (front != null) {
                    array[i] = front.val;
                    front = front.next;
                }
            } else {
                back = getNodeAtPosition(head, size - 1 - (i / 2));
                if (back != null) {
                    array[i] = back.val;
                }
            }
            if (front == back || (front != null && front.next == back)) {
                if (front != null) {
                    array[++i] = front.val;
                }
                break;
            }
        }

        int i = 0;
        ListNode current = head;
        while (current != null && i < array.length) {
            current.val = array[i];
            current = current.next;
            i++;
        }
         if (current != null) {
            current.next = null;
        }
    }

    public static int getSize(ListNode head) {
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public static ListNode getNodeAtPosition(ListNode head, int pos) {
        ListNode curr = head;
        for (int i = 0; i < pos; i++) {
            curr = curr.next;
        }
        return curr;
    }
}
