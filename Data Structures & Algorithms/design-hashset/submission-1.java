class MyHashSet {
    
    private static class Node {
        int key;
        Node next;
        
        Node(int key) {
            this.key = key;
        }
    }

    private static final int BUCKET_COUNT = 10007;
    private final Node[] buckets;

    public MyHashSet() {
        buckets = new Node[BUCKET_COUNT];
        for (int i = 0; i < BUCKET_COUNT; i++) {
            buckets[i] = new Node(-1);
        }
    }

    private int index(int key) {
        return key % BUCKET_COUNT;
    }

    private Node findPrev(int key) {
        Node prev = buckets[index(key)];
        while (prev.next != null && prev.next.key != key) {
            prev = prev.next;
        }
        return prev;
    }
    
    public void add(int key) {
        Node prev = findPrev(key);
        if (prev.next != null) return;
        prev.next = new Node(key);
    }
    
    public void remove(int key) {
        Node prev = findPrev(key);
        if (prev.next != null) prev.next = prev.next.next;
    }
    
    public boolean contains(int key) {
        Node prev = findPrev(key);
        return prev.next != null;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */