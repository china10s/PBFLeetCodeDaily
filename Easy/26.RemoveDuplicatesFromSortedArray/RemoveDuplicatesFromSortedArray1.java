import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray1{
	public static int RemoveDuplicatesFromSortedArray(int[] nums){
		if (nums == null || nums.length == 0){
			return 0;
		}
		int inwords = 1;
		for (int i = 1 ; i<nums.length;++i){
			if(nums[i-1]<nums[i]){
				nums[inwords] = nums[i];
				++inwords;
			}
		}
		System.out.println(Arrays.toString(nums));
		return inwords;
	}
	public static void main(String[] args){
		if(RemoveDuplicatesFromSortedArray(new int[]{1,1,1,1,2,2,3,3}) == 3){
			System.out.println("success");
		}
		else{
			System.out.println("fail");
		}
		if(RemoveDuplicatesFromSortedArray(new int[]{1,1,1,1,1,2,2,2,2,2,5}) == 3){
			System.out.println("success");
		}
		else{
			System.out.println("fail");
		}
		if(RemoveDuplicatesFromSortedArray(new int[]{}) == 0){
			System.out.println("success");
		}
		else{
			System.out.println("fail");
		}
	}
}