class Solution:
    parents = []
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        self.parents = []
        self.performParent("",n,n)

    def performParent(self,str,foreN,backN):
        if foreN == 0 and backN == 0:
            self.parents.append(str)
            return

        if foreN == backN:
            self.performParent(str+'(',foreN-1,backN)
        else:
            if foreN != 0:
                self.performParent(str+'(',foreN-1,backN)
            self.performParent(str+')',foreN,backN-1)

if __name__ == '__main__':
    solution = Solution()
    solution.generateParenthesis(1)
    print(solution.parents)