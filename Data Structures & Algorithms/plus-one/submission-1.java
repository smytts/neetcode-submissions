class Solution {
    public int[] plusOne(int[] digits) {
     int x = 1;
        int i = 0;
        List<Integer> list = new ArrayList<>();
        for (int digit : digits) {
            list.add(digit);
        }
        Collections.reverse(list);
        while (x != 0) {
            if (i < list.size()) {
                if (list.get(i) == 9) {
                    list.set(i, 0);
                } else {
                    list.set(i, list.get(i) + 1);
                    x = 0;
                }
            } else {
                list.add(x);
                x = 0;
            }
            i++;
        }
        Collections.reverse(list);
        int[] result = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);
        }
        return result;
    }
}
