class Solution {
    public boolean isValid(String s) {
        var stack = new Stack<Character>();

        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;

                char p = stack.pop();
                if(
                        (c == ')' && p != '(') ||
                                (c == '}' && p != '{') ||
                                (c == ']' && p != '[')
                ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}