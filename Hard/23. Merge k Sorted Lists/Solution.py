# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def mergeKLists(self, lists):
        """
        :type lists: List[ListNode]
        :rtype: ListNode
        """
        # if len(lists) <= 0:
        #     return []
        # lstCur = [x for x in lists]
        lstCur = []
        # 过滤数据类型
        for node in lists:
            if isinstance(node,ListNode):
                lstCur.append(node)
        if len(lstCur) <= 0:
            return []
        isAsc = self.isAsc(lstCur)
        # maxLen = self.getMaxLenl(lists)
        firstNode = self.getMostNode(lstCur,isAsc)
        
        while len(lstCur) > 0:
            mostCurVal = self.getMostNode(lstCur,isAsc)

            # lstCurTmp = lstCur.copy()
            # lstCur.clear()
            # for nd in lstCurTmp:
            #     if nd.next != None:
            #         lstCur.append(nd.next)
                    # nodeT = ListNode(nd.next.val)
                    # nodeT.next = nd.next.next
                    # lstCur.append(nodeT)
            lstCurT = lstCur.copy()
            lstCurTmp = []
            lstCur = []
            for nd in lstCurT:
                nodeT = ListNode(nd.val)
                nodeT.next = None
                lstCurTmp.append(nodeT)
                if nd.next != None:
                    lstCur.append(nd.next)
            
            isSelf = True
            for nodeTmp in lstCurTmp:
                node = mostCurVal
                nodeFore = None
                while node != None:
                    if (isAsc and nodeTmp.val < node.val):
                        if nodeFore !=None:
                            nodeFore.next = nodeTmp
                        if  nodeTmp != node:
                            nodeTmp.next = node
                        break
                    nodeFore = node
                    node = node.next
                if node == None and nodeFore !=None and not isSelf:
                    nodeFore.next = nodeTmp
                if nodeFore.val == nodeTmp.val:
                    isSelf = False
        return firstNode

    def isAsc(self,lists):
        for lst in lists:
            if lst !=None and lst.next !=None:
                return True if lst.val < lst.next.val else False
        return True

    def getMaxLenl(self,lists):
        maxLen = 0
        for lst in lists:
            maxLen = maxLen if len(lst) < maxLen else len(list)
        return maxLen

    def getMostNode(self,lstNodes,isAsc):
        mostNode = lstNodes[0]
        for node in lstNodes[1:]:
            if isAsc and mostNode.val > node.val:
                mostNode = node
            if (not isAsc) and mostNode.val < node.val:
                mostNode = node
        return mostNode
        

if __name__ == "__main__":
    solution = Solution()
    node1 = ListNode(1)
    node2 = ListNode(2)
    node3 = ListNode(2)
    node4 = ListNode(1)
    node5 = ListNode(1)
    node6 = ListNode(2)
    node1.next = node2
    node2.next = node3
    node4.next = node5
    node5.next = node6

    solution.mergeKLists([node6]) 