# Given two strings s and t, determine if they are isomorphic.

# Two strings s and t are isomorphic if the characters in s can be replaced to get t.

# All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

# Example 1:

# Input: s = "egg", t = "add"

# Output: true

# Explanation:

# The strings s and t can be made identical by:

# Mapping 'e' to 'a'.
# Mapping 'g' to 'd'.
# Example 2:

# Input: s = "foo", t = "bar"

# Output: false

# Explanation:

# The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

# Example 3:

# Input: s = "paper", t = "title"

# Output: true

 

# Constraints:

# 1 <= s.length <= 5 * 104
# t.length == s.length
# s and t consist of any valid ascii character.

# 문자열 길이가 n일 때, zip(s, t)을 사용해 O(n)번 반복문
# 각 문자를 dictionary에서 확인/삽입하는 데 평균 O(1) 소요 
# 최종 시간 복잡도 : O(n)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapping_s_t = {}  # s -> t로의 매핑
        mapping_t_s = {}  # t -> s로의 매핑
        
        for char_s, char_t in zip(s, t):
            # s -> t 매핑 확인
            if char_s in mapping_s_t:
                if mapping_s_t[char_s] != char_t:
                    return False
            else:
                mapping_s_t[char_s] = char_t
            
            # t -> s 매핑 확인
            if char_t in mapping_t_s:
                if mapping_t_s[char_t] != char_s:
                    return False
            else:
                mapping_t_s[char_t] = char_s
        
        return True
