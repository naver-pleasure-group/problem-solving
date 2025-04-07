class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int pin = target - nums[i];
            if (numMap.containsKey(pin)) {
                return new int[] { numMap.get(pin), i };
            }
            numMap.put(nums[i], i);
        }

        return null;
    }
}