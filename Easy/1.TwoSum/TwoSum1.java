import java.util.Arrays; 
import java.util.HashMap;

public class TwoSum1{
	public static int[] solution(int[] nums,int target){
		//构建 HashMap
		HashMap map = new HashMap();
		for (int i=0;i<nums.length;++i){
			map.put(nums[i],i);
		}
		for (int i = 0;i< nums.length;++i){
			int diffNum = target - nums[i];
			if(map.containsKey(diffNum) && (int)map.get(diffNum) != i){
				int diffIndex = (int)map.get(diffNum);
				System.out.println(Arrays.toString(new int[]{i,diffIndex}));
				return new int[]{i,diffIndex};
			}
		}
		return new int[]{};
	}

	public static void main(String[] args){
		if(!Arrays.equals(solution(new int[]{3,3,4,5,6,7,8},6),new int[]{0,1})){
			System.out.println("fail");
		}
	}
}
