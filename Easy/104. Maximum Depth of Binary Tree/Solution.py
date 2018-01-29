# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root == None:
            return 0
        else:
            return self.calMaxDepth(root)+1

    def calMaxDepth(self,node):
        leftDepth = 0 if (node.left == None) else self.calMaxDepth(node.left)+1
        rightDepth = 0 if (node.right == None) else self.calMaxDepth(node.right)+1
        return max(leftDepth,rightDepth)

if __name__ == "__main__":
    solution = Solution()
    leftLeftNode = TreeNode(2)
    leftNode = TreeNode(2)
    leftNode.left = leftLeftNode
    rightNode = TreeNode(2)
    rootNode = TreeNode(1)
    rootNode.left = leftNode
    rootNode.right = rightNode
    print(solution.maxDepth(rootNode))
