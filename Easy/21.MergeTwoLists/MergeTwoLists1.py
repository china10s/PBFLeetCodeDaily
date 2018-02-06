# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        head = ptrCur = ListNode(0)
        while (not l1 == None) and (not l2 == None):
            if l1.val <= l2.val:
                ptrCur.next = l1
                l1 = l1.next
            else:
                ptrCur.next = l2
                l2=l1
                l1=ptrCur.next.next
            ptrCur = ptrCur.next
        if l1 == None:
            ptrCur.next = l2
        else:
            ptrCur.next = l1
        return head.next