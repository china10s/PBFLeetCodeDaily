class Solution:
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        outPuts = []
        for ii in range(len(digits)):
            leftDig = digits[ii]
            flags = self.getrepresentLetter(int(leftDig))
            tempOutPuts = outPuts.copy()
            outPuts.clear()
            for i in flags:
                if len(tempOutPuts) == 0:
                    outPuts.append(i)
                else:
                    for tempOutPut in tempOutPuts:
                        temp = tempOutPut+i
                        outPuts.append(temp)
        return outPuts

    def getrepresentLetter(self,i):
        iFlag =(i-2)*3;
        n=3
        if i==9 or i ==7:
            n = 4
        flags = []

        chaI = ord('a')
        if i>= 8:
            chaI = ord('b')
        for  i in range(n):
            flags.append(chr(chaI+iFlag+i))
        return flags


if __name__ == '__main__':
    solution = Solution()
    print(solution.letterCombinations("7"))