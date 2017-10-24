import java.lang.Math;

public class ContainerWithMostWater1{
	public static int maxArea(int[] height){
		if (height.length<2){
			return 0;
		}
		int maxContain = 0;
		int l = 0,r = height.length-1;
		while (l<r){
			int conat = Math.min(height[l],height[r])*(r-l);
			maxContain = conat>maxContain?conat:maxContain;
			if (height[l]>height[r]){
				--r;
			} 
			else{
				++l;
			}
		}
		return maxContain;
	}
	public static void main(String[] args){
		System.out.println(maxArea(new int[]{1,2,3,4,5}));
	}
}