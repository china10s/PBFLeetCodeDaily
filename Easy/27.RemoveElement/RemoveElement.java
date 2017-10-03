public class RemoveElement{
	public static int RemoveElement(int[] nums ,int val){
		if (nums == null){
			return 0;
		}
		int iPoint = 0,valueCount = 0;
		while (iPoint < nums.length){
			if(nums[iPoint] != val){
				nums[valueCount++] = nums[iPoint];
			}
			++iPoint;
		}
		return valueCount;
	}
	public static void main(String[] args){
 		if(RemoveElement(new int[]{1,2,3,45,56,7},3) == 5){
			System.out.println("success");
		}
		else{
			System.out.println("fail");
		}
		if(RemoveElement(null,3) == 0){
			System.out.println("success");
		}
		else{
			System.out.println("fail");
		}
	}
}