# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def levelOrderBottom(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        if root == None:
            return []

        return self.calConvertArray(root)

    def calConvertArray(self,node):
        leftArray = [] if (node.left == None) else self.calConvertArray(node.left)
        rightArray = [] if (node.right == None) else self.calConvertArray(node.right)

        isBigInLeft = True
        if (len(leftArray) < len(rightArray)):
            isBigInLeft = False

        maxArray = leftArray if (isBigInLeft) else rightArray
        minArray = rightArray if (isBigInLeft) else leftArray
        for i in range(len(minArray)):
            listMax = maxArray[len(maxArray)-i-1]
            listMin = minArray[len(minArray)-i-1]
            if isBigInLeft:
                listMax.extend(listMin)
            else:
                listMax[0:0]=listMin
        maxArray.append([node.val])
        return maxArray

if __name__ == "__main__":
    solution = Solution()
    leftNode = TreeNode(2)
    leftLeftNode = TreeNode(2)
    rightNode = TreeNode(2)
    rightNode.right = leftLeftNode
    rootNode = TreeNode(1)
    rootNode.left = leftNode
    rootNode.right = rightNode
    print(solution.levelOrderBottom(rootNode))