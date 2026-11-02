class MyHashMap {

    private static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int BUCKET_COUNT = 10007;
    private Node[] buckets;

    public MyHashMap() {
        buckets = new Node[BUCKET_COUNT];
        for (int i = 0; i < BUCKET_COUNT; i++) {
            buckets[i] = new Node(-1, -1);
        }
    }

    private int getIndex(int key) {
        return key % BUCKET_COUNT;
    }

    private Node findPrev(int key) {
        Node prev = buckets[getIndex(key)];
        while (prev.next != null && prev.next.key != key) {
            prev = prev.next;
        }
        return prev;
    }
    
    public void put(int key, int value) {
        Node prev = findPrev(key);
        if (prev.next != null) {
            prev.next.value = value;
        } else {
            prev.next = new Node(key, value);
        }
    }
    
    public int get(int key) {
        Node prev = findPrev(key);
        return prev.next != null ? prev.next.value : -1;
    }
    
    public void remove(int key) {
        Node prev = findPrev(key);
        if (prev.next != null) prev.next = prev.next.next;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */