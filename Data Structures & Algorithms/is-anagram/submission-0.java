class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            System.out.println("false");
            return false;
        }
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        if (Arrays.equals(sCharArray, tCharArray)) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}
