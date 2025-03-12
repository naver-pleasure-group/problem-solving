class Solution {
	public int climbStairs(int n) {
		var dp = new int[45];
		dp[0] = 1;
		dp[1] = 2;

		for (var i = 2 ; i < 45 ; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp[n - 1];
	}
}
