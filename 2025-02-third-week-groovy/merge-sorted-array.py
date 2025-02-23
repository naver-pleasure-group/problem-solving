from typing import List

# 시간 복잡도
# O(m + n) - 한 번의 while 루프로 두 배열을 모두 처리하였음.
# 공간 복잡도 O(1) - 추가 메모리 없이 nums1을 직접 수정하였음.

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        i = m - 1 # nums1의 유효한 마지막 요소 인덱스
        j = n - 1 # nums2의 마지막 요소 인덱스
        k = m + n - 1 # nums1의 마지막 요소 인덱스
        
        while i >= 0 and j >= 0:
            if nums1[i] > nums2[j]:  # nums1의 요소가 더 크면 뒤에서부터 채움
                nums1[k] = nums1[i]
                i -= 1
            else:  # nums2의 요소가 더 크거나 같으면 nums2의 요소 채우기
                nums1[k] = nums2[j]
                j -= 1
            k -= 1
        
        # nums2에 남은 요소가 있다면 nums1 앞쪽에 복사
        while j >= 0:
            nums1[k] = nums2[j]
            j -= 1
            k -= 1
        