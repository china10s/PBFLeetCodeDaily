class Solution:
    def isMatch(self, s, p):
        """
        :type s: str
        :type p: str
        :rtype: bool
        """

        # 1、没有字符串可供比较
        if len(p) == 0:
                return len(s) == 0
        
        # 2、剩余字符串长度为1
        if len(p) == 1:
            return len(s) == 1 and (s[0] == p[0] or p[0] == '.') 

        # 3、第二位非*
        if p[1] != '*':
            if len(s) <1:
                return False
            else:
                return (s[0] == p[0] or p[0] == '.') and self.isMatch(s[1:],p[1:])
        
        # 4、第二位为*
        while len(s) > 0 and (s[0] == p[0] or p[0] == '.'):
            if self.isMatch(s,p[2:]):
                return True
            s = s[1:]
        return self.isMatch(s,p[2:])

if __name__ == "__main__":
    solution = Solution()
    print(solution.isMatch("aaa","aaaa") == False)
    print(solution.isMatch("aaa","a*") == True)
    print(solution.isMatch("","a*") == True)
    print(solution.isMatch("abc","a*b*c*") == True)
    print(solution.isMatch("baccbbcbcacacbbc","c*.*b*c*ba*b*b*.a*") == True)