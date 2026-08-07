class Solution {
    public int countSeniors(String[] details) {
        int counter = 0;
        for (String s : details) {
            int age = Integer.parseInt(s.substring(11, 13));
            if (age > 60) counter ++;
        }
        return counter;
    }
}