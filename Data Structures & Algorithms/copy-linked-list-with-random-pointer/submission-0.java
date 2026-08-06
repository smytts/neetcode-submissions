/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
         Map<Node, Node> oldListMap = new HashMap<>();
        oldListMap.put(null, null);

        Node current = head;
        while (current != null) {
            Node copy = new Node(current.val);
            oldListMap.put(current, copy);
            current = current.next;
        }

        current = head;
        while (current != null) {
            Node copy = oldListMap.get(current);
            copy.next = oldListMap.get(current.next);
            copy.random = oldListMap.get(current.random);
            current = current.next;
        }

        return oldListMap.get(head);
    }
}
