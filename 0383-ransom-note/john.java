class Solution {
	private static final int NOT_EXISTS = -1;

	public boolean canConstruct(String ransomNote, String magazine) {
		var alphabet = new int[26];

		for (char c : ransomNote.toCharArray()) {
			var index = magazine.indexOf(c, alphabet[c - 'a']);

			if (index == NOT_EXISTS) return false;

			alphabet[c - 'a'] = index + 1;
		}

		return true;
	}
}
