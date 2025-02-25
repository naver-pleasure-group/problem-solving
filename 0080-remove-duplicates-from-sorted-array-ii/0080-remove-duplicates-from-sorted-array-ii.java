class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        int index = 0;
        
        for (int k : map.keySet()) {
            int count = Math.min(map.get(k), 2);

            for(int i=0; i<count; i++) {
                nums[index++] = k;
            }
        }
        return index;
    }
}