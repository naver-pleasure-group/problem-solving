// solution 1 : 2ms
class Solution1 {
	private static final char LEFT_ROUND = '(';
	private static final char RIGHT_ROUND = ')';

	private static final char LEFT_CURLY = '{';
	private static final char RIGHT_CURLY = '}';

	private static final char LEFT_BRACKET = '[';
	private static final char RIGHT_BRACKET = ']';

	public boolean isValid(String s) {
		var stack = new ArrayDeque<Character>();

		for (var ch : s.toCharArray()) {
			if (isLeft(ch)) {
				stack.add(ch);
			} else {
				var element = stack.pollLast();

				if (element == null) return false;

				if (ch == RIGHT_ROUND && element != LEFT_ROUND) return false;

				if (ch == RIGHT_CURLY && element != LEFT_CURLY) return false;

				if (ch == RIGHT_BRACKET && element != LEFT_BRACKET) return false;
			}
		}

		return stack.isEmpty();
	}

	private boolean isLeft(char ch) {
		return ch == LEFT_ROUND || ch == LEFT_CURLY || ch == LEFT_BRACKET;
	}
}

// solution2 : 3ms
class Solution2 {
	public boolean isValid(String s) {
		var brackets = Map.of(
			')', '(',
			'}', '{',
			']', '['
		);

		var stack = new ArrayDeque<Character>();

		for (var c : s.toCharArray()) {
			if (brackets.containsKey(c)) {
				if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
					return false;
				}
			} else {
				stack.push(c);
			}
		}

		return stack.isEmpty();
	}
}
