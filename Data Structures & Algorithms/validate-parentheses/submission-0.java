class Solution {
    public boolean isValid(String s) {
         Stack<Character> bracketStack = new Stack<>();
            Map<Character, Character> bracketCheck = new HashMap<>(3);

            bracketCheck.put(')', '(');
            bracketCheck.put(']', '[');
            bracketCheck.put('}', '{');

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (bracketCheck.containsKey(c)) {
                    if (!bracketStack.isEmpty() && bracketCheck.get(c).equals(bracketStack.peek())) {
                        bracketStack.pop();
                    } else {
                        return false;
                    }
                } else {
                    bracketStack.push(c);
                }
            }
            return bracketStack.isEmpty();
    }
}
