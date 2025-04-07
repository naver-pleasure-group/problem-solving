class Solution {
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);

		while (!queue.isEmpty()) {
			int size = queue.size();
			double sum = 0;

			for (int i = 0; i < size; i++) {
				var node = queue.poll();

				sum += node.val;

				if (node.left != null) queue.add(node.left);
				if (node.right != null) queue.add(node.right);
			}

			result.add(sum / size);
		}

		return result;
	}
}
