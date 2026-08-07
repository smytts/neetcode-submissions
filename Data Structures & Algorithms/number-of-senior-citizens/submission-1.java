class Solution {
    public int countSeniors(String[] details) {
        int counter = 0;
        for (String s : details) {
            char tens = s.charAt(11);
            char ones = s.charAt(12);
            if (tens > '6' || (tens == '6' && ones > '0')) counter++;
        }
        return counter;
    }
}