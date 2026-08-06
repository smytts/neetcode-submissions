class DynamicArray {
    private int[] array;
    private int capacity;
    private int size;
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[this.capacity];
        this.size = 0;
       
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        array[size] = n;
        size++;
    }

    public int popback() {
        if (size > 0) {
            size--;
        }
        return array[size];

    }

    private void resize() {
        capacity *= 2;
        int[] resizedArray = new int[capacity];
        for (int i = 0; i < size; i++) {
            resizedArray[i] = array[i];
        }
        array = resizedArray;

    }

    public int getSize() {
        return size;

    }

    public int getCapacity() {
        return capacity;
    }
}
