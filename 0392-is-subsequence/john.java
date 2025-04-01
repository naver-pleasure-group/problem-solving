class Solution {
	public boolean isSubsequence(String s, String t) {
		var i = 0;
		var j = 0;

		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
			}

			j++;
		}

		return i == s.length();
	}
}
