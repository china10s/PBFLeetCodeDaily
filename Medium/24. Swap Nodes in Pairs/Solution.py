# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head == None or head.next == None:
            return head
        a = None
        b = head
        c = head.next
        d = head.next.next
        headRe = head
        while True:
            if a == None:
                headRe = c
            else:
                a.next = c
            c.next = b
            b.next = d
            if d == None or d.next == None:
                break
            a = b
            b = a.next
            c = b.next
            d = c.next
        return headRe

if __name__ == '__main__' :
    node1 = ListNode(1)
    node2 = ListNode(2)
    node3 = ListNode(3)
    node4 = ListNode(4)
    node1.next  = node2
    node2.next  = node3
    node3.next  = node4
    solution = Solution()
    solution.swapPairs(node4)