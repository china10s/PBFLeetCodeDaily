import java.util.Arrays; 

public class TwoSum{
	public static int[] twoSum(int[] nums,int target){
		for (int i=0;i<nums.length;++i){
			int otherFlag = target - nums[i];
			int otherIndex = TwoSum.isInArrays(nums,i+1,otherFlag);
			if (otherIndex > 0){
				System.out.println(Arrays.toString(new int[]{nums[i],otherFlag}));
				return new int[]{i,otherIndex};
			}
		}
		return new int[]{};
	}
	public static int isInArrays(int[] nums,int beginFlag,int tmp){
		for (int i=beginFlag;i<nums.length;++i){
			if (nums[i] == tmp){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		if(!Arrays.equals(twoSum(new int[]{3,3,4,5,6,7,8},6),new int[]{3,3})){
			System.out.println("fail");
		}
	}
}