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
      public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null; // Edge case: single element

        // Create a map to store node values
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode front = head;
        int size = getSize(head);

        // Populate the map with the nodes and their positions
        for (int i = 1; i <= size; i++) {
            map.put(i, front);
            front = front.next;
        }

        // Set up pointers for traversing the list
        ListNode current = head, prev = null;
        int i = 1;

        // Iterate through the list to remove the nth node from the end
        while (current != null && i <= size) {
            if (i == size - n + 1) { // This is the nth node from the end
                if (prev != null) {
                    prev.next = current.next; // Skip this node
                } else {
                    head = current.next; // Special case: removing the head
                }
            } else {
                prev = current;
            }
            current = current.next;
            i++;
        }

        // Print the modified linked list
        printLinkedList(head);
        return head;
    }

    private void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
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
}

