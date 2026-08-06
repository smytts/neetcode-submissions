class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
            for (String c : tokens) {
                switch (c) {
                    case "+" -> stack.push(stack.pop() + stack.pop());
                    case "-" -> {
                        int x = stack.pop();
                        int y = stack.pop();
                        stack.push(y - x);
                    }
                    case "*" -> stack.push(stack.pop() * stack.pop());
                    case "/" -> {
                        int x = stack.pop();
                        int y = stack.pop();
                        stack.push(y / x);
                    }
                    default -> stack.push(Integer.parseInt(c));
                }
            }
            return stack.pop();
    }
}
