class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            ans.add(new ArrayList<>(Collections.nCopies(i +1, 1)));
        }
        for (int row = 2; row < numRows; row++) {
            for (int col = 1; col < row; col++) {
                ans.get(row).set(
                    col, 
                    ans.get(row - 1).get(col - 1) + 
                    ans.get(row -1).get(col)
                );
            }
        }
        return ans;
    }
}