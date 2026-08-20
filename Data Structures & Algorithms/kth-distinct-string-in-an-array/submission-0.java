class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> freq = new HashMap<>();

        for (String s : arr) {
            freq.merge(s, 1, Integer::sum);
        }

        int counter = 0;
        for (String s : arr) {
            if (freq.get(s) == 1 && ++counter == k) return s;
        }

        return "";
    }
}