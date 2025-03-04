# Write a function to find the longest common prefix string amongst an array of strings.

# If there is no common prefix, return an empty string "".

 

# Example 1:

# Input: strs = ["flower","flow","flight"]
# Output: "fl"
# Example 2:

# Input: strs = ["dog","racecar","car"]
# Output: ""
# Explanation: There is no common prefix among the input strings.
 

# Constraints:

# 1 <= strs.length <= 200
# 0 <= strs[i].length <= 200
# strs[i] consists of only lowercase English letters if it is non-empty.

from typing import List

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""

        prefix = strs[0]  # 첫 번째 문자열을 기준으로 잡음

        for s in strs[1:]:  # 두 번째 문자열부터 비교
            while not s.startswith(prefix):  # prefix가 s의 시작 부분이 아닐 때
                prefix = prefix[:-1]  # prefix를 하나씩 줄이면서 확인
                if not prefix:
                    return ""

        return prefix