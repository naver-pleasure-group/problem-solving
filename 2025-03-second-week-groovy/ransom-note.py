# Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

# Each letter in magazine can only be used once in ransomNote.

 

# Example 1:

# Input: ransomNote = "a", magazine = "b"
# Output: false
# Example 2:

# Input: ransomNote = "aa", magazine = "ab"
# Output: false
# Example 3:

# Input: ransomNote = "aa", magazine = "aab"
# Output: true
 

# Constraints:

# 1 <= ransomNote.length, magazine.length <= 105
# ransomNote and magazine consist of lowercase English letters.


# Counter(ransomNote)와 Counter(magazine)의 연산은 각각 O(n), O(m)
# 문자 개수를 비교하는 과정은 O(n)
# 전체 시간 복잡도는 O(n + m)
from collections import Counter

class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        ransom_count = Counter(ransomNote)  # ransomNote의 문자 개수 세기
        magazine_count = Counter(magazine)  # magazine의 문자 개수 세기
        
        # ransomNote의 각 문자가 magazine에서 충분히 있는지 확인
        for char, count in ransom_count.items():
            if magazine_count[char] < count:
                return False  # 필요한 개수보다 부족하면 False
                
        return True