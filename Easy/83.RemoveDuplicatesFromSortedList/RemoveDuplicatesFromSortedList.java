 class ListNode {
	 int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

public class RemoveDuplicatesFromSortedList{
	public static ListNode deleteDuplicates(ListNode head){
		ListNode point = head;
		while(point != null){
			if (point.next != null && point.val == point.next.val){
				point.next = point.next.next;
			}
			else{
				point = point.next;
			}
		}
		return head;
	}
	public static void printNode(ListNode node){
		if (node != null){
			System.out.println(node.val);
			printNode(node.next);
		}
	}
	public static void main(String[] args){
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(2);	
		ListNode node3 = new ListNode(2);
		node1.next = node2;
		node2.next = node3;
		printNode(deleteDuplicates(node1));
	}
}