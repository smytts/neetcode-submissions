class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i), tChar = t.charAt(i);
            if ((mapST.containsKey(sChar) && mapST.get(sChar) != tChar) ||
                (mapTS.containsKey(tChar) && mapTS.get(tChar) != sChar)
            ) {
                return false;
            }
            mapST.put(sChar, tChar);
            mapTS.put(tChar, sChar);
        }
        return true;
    }
}