class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        for(num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }
        
        var maxKey = 0
        var max = 0
        for((key, count) in map) {
            if(count > max) {
                max = count
                maxKey = key
            }
        }

        return maxKey
    }
}