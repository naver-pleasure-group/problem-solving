// solution 1 : 0ms..?
class Solution1 {
	public List<String> summaryRanges(int[] nums) {
		var result = new ArrayList<String>();

		if (nums.length == 0) {
			return result;
		}

		int a = nums[0];
		int b = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] + 1 != nums[i]) {
				result.add(summarize(a, b));

				a = nums[i];
				b = nums[i];
			} else {
				b = nums[i];
			}
		}

		result.add(summarize(a, b));

		return result;
	}

	private String summarize(int a, int b) {
		if (a == b) {
			return Integer.toString(a);
		}

		var sb = new StringBuilder();
		sb.append(a);
		sb.append("->");
		sb.append(b);

		return sb.toString();
	}
}

// solution 2 : 5ms..?
class Solution2 {
	public List<String> summaryRanges(int[] nums) {
		var result = new ArrayList<String>();

		var i = 0;

		while (i < nums.length) {
			var start = nums[i];

			while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
				i++;
			}

			var summary = start == nums[i]
				? Integer.toString(start)
				: start + "->" + nums[i];

			result.add(summary);

			i++;
		}

		return result;
	}
}
