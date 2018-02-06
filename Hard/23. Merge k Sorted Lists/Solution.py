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
        if not lists or len(lists) <= 0:
            return []
        cnt = len(lists)
        gap = 1
        while gap < cnt:
            i = 0
            while i+gap < cnt:
                lst1 = lists[i]
                lst2 = lists[i+gap]
                if lst1 and lst2:
                    lists[i]  = self.mergeTwoLists(lst1,lst2)
                elif lst1:
                    lists[i] = lst1
                elif lst2:
                    lists[i] = lst2
                i = i+gap*2
            gap=gap*2
        return lists[0]

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