class Solution {
    public int scoreOfString(String s) {
        int[] asciiValues = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            asciiValues[i] = (int) s.charAt(i);
        }

        int sum = 0, count = 0;
        while (count < asciiValues.length - 1) {
            if (count == asciiValues.length - 1) break;
            sum += Math.abs(asciiValues[count] - asciiValues[count + 1]);
            count++;
        }

        return sum;
    }
}