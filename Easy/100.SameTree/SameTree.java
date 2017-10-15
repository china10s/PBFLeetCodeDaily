

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
public class SamrTree{
	public static boolean isSameTree(TreeNode node1,TreeNode node2){
		if(node1 == null &&node2 ==null){
			return true;
		}
		else if( node1 !=null && node2 !=null){
			if (node1.val == node2.value){
				return (isSameTree(node1.left,node2.left) && isSameTree(node1.right,node2.right)); 
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
	public static void main(String[] args){
		
	}
}