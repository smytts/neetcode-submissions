class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();
            Stack<Character> stack = new Stack<>();
            backtrack(n, 0, 0, stack, lst);
            return lst;
    }
     private void backtrack(int n, int openCount, int closedCount, Stack<Character> stack, List<String> lst) {
            if (openCount == closedCount && openCount == n) {
                StringBuilder builder = new StringBuilder();
                for (char c : stack) {
                    builder.append(c);
                }
                lst.add(builder.toString());
                return;
            }
            if (openCount < n) {
                stack.push('(');
                backtrack(n, openCount + 1, closedCount, stack, lst);
                stack.pop();
            }
            if (closedCount < openCount) {
                stack.push(')');
                backtrack(n, openCount, closedCount + 1, stack, lst);
                stack.pop();
            }
        }
}
