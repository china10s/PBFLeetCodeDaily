class ListNode {
     int val;
     ListNode next;
	 ListNode(int x) { val = x; }
}

public class AddTwoNumbers{
	public static ListNode AddTwoNumbers(ListNode l1,ListNode l2){
		if (l1 == null){
			return l2;
		}
		if (l2 == null){
			return l1;
		}
		int predNum = 0;
		ListNode l1Ptr = l1,l2Ptr=l2;
		while (l1Ptr != null || l2Ptr !=null){
			int sumNum = 0;
			sumNum += l1Ptr==null?0:l1Ptr.val;
			sumNum += (l2Ptr!=null && l2Ptr!=l1Ptr)?l2Ptr.val:0;
			sumNum += predNum;
			l1Ptr.val = sumNum%10;
			predNum = sumNum/10;
			if (l1Ptr != null && l2Ptr != null){
				if(l1Ptr.next==null && l2Ptr.next!=null){
					l1Ptr.next = l2Ptr.next;
				}
				else if(l1Ptr.next!=null && l2Ptr.next==null){
					l2Ptr.next = l1Ptr.next;	
				}
				else{
				}
			}
			if (l1Ptr.next == null && l2Ptr.next == null){
					if(predNum >0){
						ListNode nodeLast = new ListNode(predNum);
						l1Ptr.next = nodeLast;
						break;
					}
			}
			l1Ptr=l1Ptr==null?null:l1Ptr.next;
			l2Ptr=l2Ptr==null?null:l2Ptr.next;
			
		}
		return l1;
	}
	public static void printNode(ListNode node){
		if (node != null){
			System.out.println(node.val);
			printNode(node.next);
		}
	}
	public static void main(String[] args){
		ListNode node1 = new ListNode(9);
		ListNode node2 = new ListNode(9);	
		ListNode node3 = new ListNode(9);
		node1.next = node2;
		node2.next = node3;

		ListNode node4 = new ListNode(1);
		// ListNode node1 = new ListNode(0);

		// ListNode node4 = new ListNode(7);
		// ListNode node5 = new ListNode(3);
		// node4.next = node5;		
		printNode(AddTwoNumbers(node1,null));
	}
}