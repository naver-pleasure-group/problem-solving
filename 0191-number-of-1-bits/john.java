class Solution {
	public int hammingWeight(int n) {
		var binaryString = Integer.toBinaryString(n);

		return (int)binaryString.chars()
			.mapToObj(it -> String.valueOf((char)it))
			.filter(it -> it.equals("1"))
			.count();
	}
}
