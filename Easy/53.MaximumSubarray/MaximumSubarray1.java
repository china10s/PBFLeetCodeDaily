public class MaximumSubarray1{
	public static void main(String [] args){
		if (MaximumSubarray1(new int[]{-2,1,-3,4,-1,2,1,-5,4})==6){
			System.out.println("Sucess");			
		}
		else{
			System.out.println("Fail");
		}
		if (MaximumSubarray1(new int[]{-1})==-1){
			System.out.println("Sucess");			
		}
		else{
			System.out.println("Fail");
		}
		if (MaximumSubarray1(new int[]{-2,-1})==-1){
			System.out.println("Sucess");	
		}
		else{
			System.out.println("Fail");
		}
	}
	public static int MaximumSubarray1(int[] nums){
		if (nums.length == 0){
			return 0;
		}

		int maxSofar = nums[0],maxEndingHere = nums[0];
		for (int i = 1;i<nums.length;++i){
			maxEndingHere = maxEndingHere+nums[i]>nums[i]?maxEndingHere+nums[i]:nums[i];
			maxSofar = maxSofar>maxEndingHere?maxSofar:maxEndingHere;
		}
		System.out.println(maxSofar);
		return maxSofar;
	}
}