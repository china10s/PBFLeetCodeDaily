import java.util.Arrays; 
import java.util.HashMap;

public class TwoSum2{
	public static int[] TwoSum2(int[] nums,int target){
		HashMap map = new HashMap();
		for (int i =0;i<nums.length;++i){
			int diffNum = target-nums[i];
			if (map.containsKey(diffNum)){
				System.out.println(Arrays.toString(new int[]{(int)map.get(diffNum),i}));
				return new int[]{(int)map.get(diffNum),i};
			}
			map.put(nums[i],i);
		}
		return new int[]{};
	}
	public static void main(String[] args){
		if(!Arrays.equals(TwoSum2(new int[]{3,3,4,5,6,7,8},6),new int[]{0,1})){
			System.out.println("fail");
		}
	}	
}
