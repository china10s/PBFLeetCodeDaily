# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def reverseKGroup(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        if head == None or head.next == None:
            return head
        pntCur = headRe = ListNode(0)
        headRe.next = head
        tags = []
        while len(tags) < k+2:
            tags.append(pntCur)
            if not pntCur :
                if  len(tags) == k+2:
                    continue
                else:
                    return head
            pntCur = pntCur.next
        nTagsNum = len(tags)
        while True:
            for i in range(1,nTagsNum-2):
                tags[i+1].next = tags[i]
            tags[0].next = tags[nTagsNum-2]
            tags[1].next = tags[nTagsNum-1]
            
            # 更新位置
            tags[0] = tags[1]
            for i in range(1,nTagsNum):
                if not tags[i-1].next and i < nTagsNum-1:
                    return headRe.next
                else:
                    tags[i] = tags[i-1].next
        return headRe.next

if __name__ == '__main__' :
    node1 = ListNode(1)
    node2 = ListNode(2)
    node3 = ListNode(3)
    node4 = ListNode(4)
    node1.next  = node2
    node2.next  = node3
    node3.next  = node4
    solution = Solution()
    solution.reverseKGroup(node3,2)