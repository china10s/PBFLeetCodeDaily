
import sys

class Solution:
	def threeSumClosest(self,nums,target):
		"""
        :type nums: List[int]
        :type target: int
        :rtype: int
		"""
		
		resArry = []
		zeroNum = 0
		posArry = []
		nagiArry = []
		for numTmp in nums:
			curNum = numTmp
			iPoint = 0
			lisTmp  = None
			if curNum <target:
				lisTmp = nagiArry
			elif curNum > target:
				lisTmp = posArry
			elif curNum == target:
				zeroNum+=1
			if lisTmp != None:
				while iPoint <len(lisTmp) and curNum > lisTmp[iPoint]:
					iPoint+=1
				lisTmp.insert(iPoint,curNum)

		for i in range(0,len(nagiArry)):
			iNavCur = nagiArry[i]
			if i >0 and iNavCur == nagiArry[i-1]:
				continue
			for j in range(0,len()):
				iPosCur = posArry[j]
				if j > 0 and iPosCur[j-1]:
					continue
				if iNavCur*-1 == iPosCur:
					if zeroNum > 0:
						


		print(nagiArry)
		print('aaaa')
		print(posArry)	
		return 2


if __name__ == '__main__':
	so = Solution()
	ret = so.threeSumClosest([-1,2,1,-4],1)
	