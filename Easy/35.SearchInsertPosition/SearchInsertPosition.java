public class SearchInsertPosition{
	public static int SearchInsertPosition(int [] nums,int target){
		if (nums == null || nums.length == 0){
			return 0;
		}
		int i = 0;
		while (i<nums.length){
			if (nums[i]>target){
				if (i == 0){
					return 0;
				}
			}
			else if (nums[i]<target){
				if (i+1 < nums.length){
					if (target < nums[i+1]){
						return i+1;
					}
				}
				else{
					return i+1;
				}
			}
			else{
				return i;
			}
			++i;
		}
		return 0;
	}
	public static void main(String[] args){
		if (SearchInsertPosition(new int[]{1,2,4,5},2) == 1){
			System.out.println("sucess");
		}
		else{
			System.out.println("fail");
		}
	}
}