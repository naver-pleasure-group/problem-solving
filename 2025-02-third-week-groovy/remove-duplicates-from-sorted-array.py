class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:  # empty list 처리
            return 0
        
        k = 1

        for i in range(1, len(nums)):  # 두 번째 요소부터 반복
            if nums[i] != nums[i - 1]:  # 이전 리스트의 요소와 다를 경우.
                nums[k] = nums[i]  # nums의 앞쪽에 저장
                k += 1
        
        return k