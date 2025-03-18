class Solution {
	public String addBinary(String a, String b) {
		var i = a.length() - 1;
		var j = b.length() - 1;

		var sb = new StringBuilder();
		var carry = 0;

		while (i >= 0 || j >=  0 || carry > 0) {
			var x = (i >= 0) ? a.charAt(i--) - '0' : 0;
			var y = (j >= 0) ? b.charAt(j--) - '0' : 0;

			var sum = x + y + carry;

			sb.append(sum % 2);
			carry = sum / 2;
		}

		return sb.reverse().toString();
	}
}
