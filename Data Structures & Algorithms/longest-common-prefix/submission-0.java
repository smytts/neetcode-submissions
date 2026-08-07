class Solution {
    private TrieNode root = new TrieNode();

    private static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEndOfWord = false;
    }

    private void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            current.children.putIfAbsent(c, new TrieNode());
            current = current.children.get(c);
        }
        current.isEndOfWord = true;
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        for (String s : strs) {
            insert(s);
        }

        StringBuilder prefix = new StringBuilder();
        TrieNode current = root;

        while(true) {
            if (current.isEndOfWord || current.children.size() != 1) {
                break;
            }

            Map.Entry<Character, TrieNode> onlyEntry = current.children.entrySet().iterator().next();
            
            prefix.append(onlyEntry.getKey());
            current = onlyEntry.getValue();
        }
        return prefix.toString();
    }
}