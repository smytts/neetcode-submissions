class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>(); // create a pairing of temperature and index

        for (int i = 0; i < temperatures.length; i++) {
            int temperature = temperatures[i];
            while (!stack.isEmpty() && temperature > stack.peek()[0]) { //check first value (temp) at top of stack
                int[] tempIndexPair = stack.pop();
                result[tempIndexPair[1]] = i - tempIndexPair[1];
            }
            stack.push(new int[]{temperature, i});
        }
        return result;
      
    }
}
