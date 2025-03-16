
# Given a pattern and a string s, find if s follows the same pattern.

# Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

# Each letter in pattern maps to exactly one unique word in s.
# Each unique word in s maps to exactly one letter in pattern.
# No two letters map to the same word, and no two words map to the same letter.
 

# Example 1:

# Input: pattern = "abba", s = "dog cat cat dog"

# Output: true

# Explanation:

# The bijection can be established as:

# 'a' maps to "dog".
# 'b' maps to "cat".
# Example 2:

# Input: pattern = "abba", s = "dog cat cat fish"

# Output: false

# Example 3:

# Input: pattern = "aaaa", s = "dog cat cat dog"

# Output: false

 

# Constraints:

# 1 <= pattern.length <= 300
# pattern contains only lower-case English letters.
# 1 <= s.length <= 3000
# s contains only lowercase English letters and spaces ' '.
# s does not contain any leading or trailing spaces.
# All the words in s are separated by a single space.

# s.split() → 단어 리스트를 만드는 데 O(N)
# zip(pattern, words)을 이용해 반복문을 돌면서 딕셔너리를 갱신하는 데 O(N)
# O(N)의 시간 복잡도를 가진다.
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()  # 공백을 기준으로 단어 리스트 생성
        if len(pattern) != len(words):  # 패턴 길이와 단어 개수가 다르면 False
            return False
        
        char_to_word = {}  # 패턴 문자 -> 단어 매핑
        word_to_char = {}  # 단어 -> 패턴 문자 매핑

        for char, word in zip(pattern, words):
            if char in char_to_word:
                if char_to_word[char] != word:  # 기존 매핑과 다르면 False
                    return False
            else:
                char_to_word[char] = word  # 새로운 매핑 저장

            if word in word_to_char:
                if word_to_char[word] != char:  # 기존 매핑과 다르면 False
                    return False
            else:
                word_to_char[word] = char  # 새로운 매핑 저장

        return True
