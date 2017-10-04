public class SearchInsertPosition1{
	public static int SearchInsertPosition1(int [] nums,int target){
		int low = 0 ,high = nums.length;
		while(low < high){
			int mid = low + (high-low)/2;
			if (nums[mid] >= target){
				high = mid;
			}
			else{
				low = mid+1;
			}
		}
		return low;
	}
	public static void main(String[] args){
		if (SearchInsertPosition1(new int[]{1},1) == 0){
			System.out.println("sucess");
		}
		else{
			System.out.println("fail");
		}
	}
}