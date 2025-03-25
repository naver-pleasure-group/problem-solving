// solution 1
class Solution {
	public int[] plusOne(int[] digits) {
		var length = digits.length - 1;

		var result = new ArrayDeque<Integer>();

		var sum = digits[length] + 1;

		result.addFirst(sum % 10);

		var carry = (sum / 10) > 0 ? 1 : 0;

		for (var i = length - 1 ; 0 <= i ; i--) {
			sum = digits[i] + carry;

			result.addFirst(sum % 10);

			carry = (sum / 10) > 0 ? 1 : 0;
		}

		if (carry != 0) result.addFirst(1);

		return result.stream()
			.mapToInt(Integer::intValue)
			.toArray();
	}
}

// solution 2
class Solution {
	public int[] plusOne(int[] digits) {
		var length = digits.length;
		var result = new int[length + 1];

		var carry = 1;
		for (var i = length - 1; i >= 0; i--) {
			var sum = digits[i] + carry;
			result[i + 1] = sum % 10;
			carry = sum / 10;
		}

		if (carry > 0) {
			result[0] = carry;
			return result;
		} else {
			return Arrays.copyOfRange(result, 1, result.length);
		}
	}
}
