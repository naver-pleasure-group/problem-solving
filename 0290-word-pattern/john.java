class Solution {
	public boolean wordPattern(String pattern, String s) {
		var split = s.split(" ");

		if (split.length != pattern.length()) return false;

		var map = new HashMap<Character, String>();

		var index = 0;

		for (char c : pattern.toCharArray()) {
			if (!map.containsKey(c)) {
				if (map.containsValue(split[index])) {
					return false;
				}

				map.put(c, split[index++]);
			} else {
				if (!map.get(c).equals(split[index++])) {
					return false;
				}
			}
		}

		return true;
	}
}
