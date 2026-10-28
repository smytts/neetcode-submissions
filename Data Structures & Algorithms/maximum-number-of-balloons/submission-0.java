class Solution {
    public int maxNumberOfBalloons(String text) {
        String keyword = "balon";
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            if (keyword.indexOf(c) != -1)
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        if (countMap.size() < 5) return 0;

        countMap.put('l', countMap.get('l') / 2);
        countMap.put('o', countMap.get('o') / 2);

        return Collections.min(countMap.values());
    }
}