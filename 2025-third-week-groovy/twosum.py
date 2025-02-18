class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_map = {}

        for i, num in enumerate(nums):
            complement = target - num  # 현재 숫자와 더해서 target이 되는 값
            if complement in num_map:
                return [num_map[complement], i]  # 이미 존재하면 결과 반환
            num_map[num] = i  # 현재 숫자와 인덱스 저장

        return []