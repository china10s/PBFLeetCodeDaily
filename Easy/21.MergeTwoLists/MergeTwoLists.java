

 public class MergeTwoLists{
	public static class ListNode {
 		int val;
 		ListNode next;
 		ListNode(int x) { val = x; }
 	}
	public static ListNode MergeTwoLists(ListNode l1,ListNode l2){
		if (l1 == null){
			return l2;
		}
		if (l2 == null){
			return l1;
		}
		//判断是否升序
		int iAl1 = isAes(l1,l1.val);
		int iAl2 = isAes(l2,l2.val);
		System.out.println("iA1"+iAl1);
		System.out.println("iA2"+iAl2);
		
		boolean isAes = iAl1!=0?iAl1==1:(iAl2!=0?iAl2==1:true);
		boolean isNode1 = lengthForNode(l1,-1)>lengthForNode(l2,-1);
		ListNode nodeRes = isNode1?l1:l2;
		ListNode nodeNext = isNode1?l2:l1;

		System.out.println("res");
		printNode(nodeRes);
		System.out.println("next");
		printNode(nodeNext);

		ListNode nodePnt = nodeRes,nodePre = null,node1=l1,node2=l2;
		while(nodeNext!=null){

			ListNode nodeNextPnt = null;
			//升序\降序
			while(nodePnt != null){
				if ((isAes && nodePnt.val > nodeNext.val) || (!isAes && nodePnt.val > nodeNext.val)){
					if (nodePre != null){
						nodePre.next = nodeNext;
					}
					else{
						nodeRes = nodeNext;
					}
					nodeNextPnt = nodeNext.next;
					nodeNext.next = nodePnt;
					
					nodePnt = nodeNext;
					break;
				}
				nodePre = nodePnt;
				nodePnt = nodePnt.next;
			}
			if (nodePnt == null){
				nodePre.next = nodeNext;
				break;
			}
			nodeNext = nodeNextPnt;
		}
		System.out.println("result");
		return nodeRes;
	}
	public static int isAes(ListNode node,int val){
		if (node== null){
			return 0;
		}
		if (node.val > val){
			return 1;
		}
		else if (node.val < val){
			return -1;
		}
		else {
			return isAes(node.next,node.val);
		}
	}
	public static int lengthForNode(ListNode node,int length){
		if (node == null){
			return length;
		}
		else{
			return lengthForNode(node.next,length+1);
		}
	}
	public static void printNode(ListNode node){
		if (node != null){
			System.out.println(node.val);
			printNode(node.next);
		}
	}
	public static void main(String[] args){
		// ListNode node1 = new ListNode(1);
		// ListNode node2 = new ListNode(3);	
		// ListNode node3 = new ListNode(5);
		// node1.next = node2;
		// node2.next = node3;
		
		// ListNode node4 = new ListNode(2);
		// ListNode node5 = new ListNode(4);	
		// ListNode node6 = new ListNode(6);
		// node4.next = node5;
		// node5.next = node6;

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(3);	
		ListNode node3 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		
		ListNode node4 = new ListNode(4);


		// MergeTwoLists(node1,node4);
		printNode(MergeTwoLists(node1,node4));
	}
}