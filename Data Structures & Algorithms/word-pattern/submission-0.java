class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) return false;

        Map<Object, Integer> objectToIndex = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            
            Integer prevC = objectToIndex.put(c, i);
            Integer prevWord = objectToIndex.put(word, i);

            if (!Objects.equals(prevC, prevWord)) return false;
        }

        return true;
    }
}