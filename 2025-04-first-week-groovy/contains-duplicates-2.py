from typing import List

# Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

# Example 1:

# Input: nums = [1,2,3,1], k = 3
# Output: true
# Example 2:

# Input: nums = [1,0,1,1], k = 1
# Output: true
# Example 3:

# Input: nums = [1,2,3,1,2,3], k = 2
# Output: false
 

# Constraints:

# 1 <= nums.length <= 105
# -109 <= nums[i] <= 109
# 0 <= k <= 105

# 시간 복잡도 O(N) : 리스트를 한 번만 순회하면서 해시맵을 갱신 및 조회
class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        index_map = {}  # 숫자 -> 마지막으로 등장한 인덱스 저장

        for i, num in enumerate(nums):
            if num in index_map and i - index_map[num] <= k:
                return True
            index_map[num] = i  # 현재 숫자의 인덱스 갱신

        return False
