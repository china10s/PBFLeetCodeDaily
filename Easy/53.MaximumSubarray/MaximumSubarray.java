public class MaximumSubarray{
	public static void main(String [] args){
		if (MaximumSubarray(new int[]{-2,1,-3,4,-1,2,1,-5,4})==6){
			System.out.println("Sucess");			
		}
		else{
			System.out.println("Fail");
		}
		if (MaximumSubarray(new int[]{-1})==-1){
			System.out.println("Sucess");			
		}
		else{
			System.out.println("Fail");
		}
		if (MaximumSubarray(new int[]{-2,-1})==-1){
			System.out.println("Sucess");			
		}
		else{
			System.out.println("Fail");
		}
	}
	public static int MaximumSubarray(int[] nums){
		if (nums.length == 0){
			return 0;
		}
		if (nums.length == 1)	{
			return nums[0];
		}
		int pointB = 0,pointN = 0,maxSum = nums[0];
		while (pointB < nums.length){
			int sumTmp = 0;
			pointN = pointB;
			while (pointN < nums.length){
				sumTmp += nums[pointN];
				if(sumTmp > maxSum){
					maxSum = sumTmp;
				}
				++pointN;
			}
			++pointB;
		}
		System.out.println(maxSum);
		return maxSum;
	}
}