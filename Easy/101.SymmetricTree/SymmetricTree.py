

class TreeNode:
    def __init__(self, x):
       self.val = x
       self.left = None
       self.right = None


class Solution:
	def __init__(self):
		self.arrVal = []
		self.arrTmp = []

	def isSymmetric(self,root):
		if root == None:
			return True
		num = 0
		self.arrTmp.append(root)
		while (len(self.arrTmp) != 0):
			tempNode = self.arrTmp[0]
			del self.arrTmp[0]
			if tempNode == None:
				self.arrVal.append(None)
				self.arrTmp.append(None)
				self.arrTmp.append(None)	
			else:
				self.arrVal.append(tempNode.val)
				self.arrTmp.append(tempNode.left)
				self.arrTmp.append(tempNode.right)
			if (len(self.arrVal) == pow(2,num)):
				num+=1
				if not self.isHUI(self.arrVal):
					return False
				else:
					del self.arrVal[:]
					if (self.isNoneList(self.arrTmp)):
						return True
					else:
						continue

		print(self.arrVal)
		return True

	def isHUI(self,lst):
		i = 0
		while (i < len(lst)-i-1):
			if lst[i] != lst[len(lst)-i-1]:
				return False
			i+=1
		return True

	def isNoneList(self,lst):
		for i in self.arrTmp:
			if i != None:
				return False
		return True

if __name__ == "__main__":
	solution = Solution()
	leftNode = TreeNode(2)
	rightNode = TreeNode(2)
	rootNode = TreeNode(1)
	rootNode.left = leftNode
	rootNode.right = rightNode
	print(solution.isSymmetric(rootNode))
