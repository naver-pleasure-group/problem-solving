// solution 1
class Solution {
	public int getMinimumDifference(TreeNode root) {
		var queue = new ArrayDeque<TreeNode>();
		queue.add(root);

		var values = new ArrayList<Integer>();

		while (!queue.isEmpty()) {
			var node = queue.poll();

			values.add(node.val);

			if (node.left != null) queue.add(node.left);
			if (node.right != null) queue.add(node.right);
		}

		var min = Integer.MAX_VALUE;

		for (var i = 0 ; i < values.size() - 1 ; i++) {
			for (var j = i + 1 ; j < values.size() ; j++) {
				min = Math.min(min, Math.abs(values.get(i) - values.get(j)));
			}
		}

		return min;
	}
}

// solution 2
