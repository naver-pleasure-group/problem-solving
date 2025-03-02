class Solution {
	public boolean isPalindrome(String s) {
		var start = 0;
		var end = s.length() - 1;

		while (start < end) {
			var left = s.charAt(start);
			var right = s.charAt(end);

			if (isNotLetterOrDigit(left)) {
				start++;
				continue;
			}

			if (isNotLetterOrDigit(right)) {
				end--;
				continue;
			}

			if (notEquals(left, right)) {
				return false;
			}

			start++;
			end--;
		}

		return true;
	}

	private boolean isNotLetterOrDigit(char ch) {
		return !Character.isLetterOrDigit(ch);
	}

	private boolean notEquals(char ch1, char ch2) {
		return Character.toLowerCase(ch1) != Character.toLowerCase(ch2);
	}
}
