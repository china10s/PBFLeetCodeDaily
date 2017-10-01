import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray{
	public static int RemoveDuplicatesFromSortedArray(int[] nums){
		if (nums == null || nums.length == 0){
			return 0;
		}
		int count = 1,pointer = 1,numPre = nums[0];
		int waste =0;
		while(pointer < nums.length){
			if (nums[pointer] != numPre){
				numPre = nums[pointer];
				++count;
			}
			else{
				++waste;
			}
			if(waste > 0){
				nums[pointer - waste]= nums[pointer];
			}
			++pointer;
		}
		System.out.println(Arrays.toString(nums));
		return count;
	}
	public static void main(String[] args){
		if(RemoveDuplicatesFromSortedArray(new int[]{1,1,1,1,2,2,3,3}) == 3){
			System.out.println("success");
		}
		else{
			System.out.println("fail");
		}
		if(RemoveDuplicatesFromSortedArray(new int[]{3}) == 1){
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