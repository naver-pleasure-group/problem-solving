class Solution {
	public boolean isIsomorphic(String s, String t) {
		var map = new HashMap<Character, Character>();

		if (s.length() != t.length()) return false;

		for (var i = 0 ; i < s.length() ; i++) {
			var x = s.charAt(i);
			var y = t.charAt(i);

			if (map.containsKey(x)) {
				if (map.get(x) != y) return false;
			} else {
				if (map.containsValue(y)) return false;

				map.put(x, y);
			}
		}

		return true;
	}
}
