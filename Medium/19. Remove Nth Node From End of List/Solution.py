# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        curNode = head
        targetNode = head
        targetBeforeNode = None
        while curNode != None:
            if n <= 0:
                targetBeforeNode = targetNode
                targetNode = targetNode.next
            curNode = curNode.next
            n = n-1
        if targetBeforeNode == None:
            head = head.next
        else:
            targetBeforeNode.next = targetNode.next
        # elif targetNode.next!=None:
        #     targetNode.next = targetNode.next.next
        # else:
        #     targetNode.next = None
        return head

if __name__ == '__main__':
    node1 = ListNode(1)
    node2 = ListNode(2)
    node3 = ListNode(3)
    node1.next = node2
    node2.next = node3
    solution = Solution()
    solution.removeNthFromEnd(node2,1)