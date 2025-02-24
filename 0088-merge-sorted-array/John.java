class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		var index1 = m - 1;
		var index2 = n - 1;

		for (int i = nums1.length - 1; i >= 0 && index1 >= 0 && index2 >= 0; i--) {
			nums1[i] = nums1[index1] >= nums2[index2] ? nums1[index1--] : nums2[index2--];
		}

		while(index2 >= 0) {
			nums1[index2] = nums2[index2--];
		}
	}
}
