# Given the roots of two binary trees p and q, write a function to check if they are the same or not.

# Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

 

# Example 1:


# Input: p = [1,2,3], q = [1,2,3]
# Output: true
# Example 2:


# Input: p = [1,2], q = [1,null,2]
# Output: false
# Example 3:


# Input: p = [1,2,1], q = [1,1,2]
# Output: false
 

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

# 깊이 우선 탐색(DFS)을 수행하며, 트리의 모든 노드를 방문하므로 시간복잡도는 O(N) 
class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        # 둘 다 None이면 동일한 트리
        if not p and not q:
            return True
        # 하나만 None이거나, 값이 다르면 다른 트리
        if not p or not q or p.val != q.val:
            return False
        # 왼쪽 서브트리와 오른쪽 서브트리를 각각 비교

        result = self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)

        return result
