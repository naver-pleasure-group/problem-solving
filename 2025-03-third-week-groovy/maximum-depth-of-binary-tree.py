# Given the root of a binary tree, return its maximum depth.

# A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 

# Example 1:


# Input: root = [3,9,20,null,null,15,7]
# Output: 3
# Example 2:

# Input: root = [1,null,2]
# Output: 2
 

# Constraints:

# The number of nodes in the tree is in the range [0, 104].
# -100 <= Node.val <= 100

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from typing import Optional

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


# 트리의 모든 노드를 한 번씩 방문하므로 O(N)
# 재귀 호출이 노드 개수만큼 발생하므로 최악의 경우 O(N) 깊이의 스택 사용
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0  # 노드가 없으면 깊이는 0
        
        left_depth = self.maxDepth(root.left)  # 왼쪽 서브트리 깊이
        right_depth = self.maxDepth(root.right)  # 오른쪽 서브트리 깊이
        
        return max(left_depth, right_depth) + 1  # 둘 중 더 큰 깊이에 +1
