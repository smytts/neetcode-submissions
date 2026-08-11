class Solution {
    public boolean isIsomorphic(String s, String t) {
        return isValidMap(s, t) && isValidMap(t, s);
    }

    private static boolean isValidMap(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (map.containsKey(sChar) && map.get(sChar) != tChar) {
                return false;
            }
            map.put(sChar, tChar);
        }
        return true;
    }
}