class TimeMap {
    private Map<String, List<Pair<Integer, String>>> keyValStore;

    public TimeMap() {
        keyValStore = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        keyValStore.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair<>(timestamp, value));
    }

    public String get(String key, int timestamp) {
        List<Pair<Integer, String>> values = keyValStore.getOrDefault(key, new ArrayList<>());
        int left = 0, right = values.size() - 1;
        String result = "";

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (values.get(middle).getKey() <= timestamp) {
                result = values.get(middle).getValue();
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return result;
    }

    public static class Pair<Key, Value> {
        private final Key key;
        private final Value value;

        public Pair(Key key, Value value) {
            this.key = key;
            this.value = value;
        }

        public Key getKey() {
            return key;
        }

        public Value getValue() {
            return value;
        }
    }
}
