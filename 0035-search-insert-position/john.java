class Solution {
	public int searchInsert(int[] nums, int target) {
		var start = 0;
		var end = nums.length - 1;

		while (start <= end) {
			var mid = (start + end) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return start;
	}
}
