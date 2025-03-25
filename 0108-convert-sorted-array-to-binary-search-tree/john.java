class Solution {
	public TreeNode sortedArrayToBST(int[] nums) {
		return subTree(nums, 0, nums.length - 1);
	}

	private TreeNode subTree(int[] nums, int left, int right) {
		if (left > right) return null;

		var mid = (left + right) / 2;

		var node = new TreeNode(nums[mid]);

		node.left = subTree(nums, left, mid - 1);
		node.right = subTree(nums, mid + 1, right);

		return node;
	}
}
