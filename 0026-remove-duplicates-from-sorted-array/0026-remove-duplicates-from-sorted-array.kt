class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var unique = 0 // 유니크값을 카운터할 변수
        for (n in 1 until nums.size) { // 인덱스 1씩 
            if (nums[n] != nums[unique]) {  // 배열의 인덱스에 접근해서 이전 유니크값과 일치하는지 비교(중복체크)
                unique++ // 중복되지 않다면 유니크값 카운트 + 1
                nums[unique] = nums[n] // nums 배열에 유니크값 적재 
            }
        }
        return unique + 1
    }
}
