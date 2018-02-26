# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

import math

class Solution:
    numsRet = []
    numsRetNode = []
    def sortedArrayToBST(self, nums):
        """
        :type nums: List[int]
        :rtype: TreeNode
        """
        self.numsRet.clear()
        self.numsRetNode.clear()
        if nums == None or len(nums) <= 0:
            return []
        rootNode = self.buildTree(nums,0,len(nums)-1)
        if rootNode == None:
            return []
        self.searchMFTree(rootNode)
        return self.numsRet
    
    def buildTree(self,nums,i,j):
        midd = math.ceil((i+j)/2)
        rootNode = TreeNode(nums[midd])
        if midd != i:
            leftNode = self.buildTree(nums,i,midd-1)
            rootNode.left = leftNode
        if midd != j:
            rightNode = self.buildTree(nums,midd+1,j)
            rootNode.right = rightNode
        return rootNode
    
    def searchMFTree(self,rootNode):
        self.numsRetNode.append(rootNode)
        while(len(self.numsRetNode) > 0):
            nodeTmp = self.numsRetNode[0]
            if nodeTmp == None:
                self.numsRet.append(None)
            else:
                self.numsRet.append(nodeTmp.val)
                self.numsRetNode.append(nodeTmp.left)
                self.numsRetNode.append(nodeTmp.right)
            del self.numsRetNode[0]
        return 