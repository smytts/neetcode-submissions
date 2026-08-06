class Solution {
    public boolean hasDuplicate(int[] nums) {
     Set<Integer> distinctNum = new HashSet<>();
        for (int num : nums) {
            if (distinctNum.contains(num)) {
                System.out.println("true");
                return true;
            }
            distinctNum.add(num);
        }
        System.out.println("false");
        return false;
    }
}
