import java.lang.Math;

public class ContainerWithMostWater{
	public static int maxArea(int[] height){
		int maxContain = 0;
		for(int i=0;i<height.length;++i){
			for(int j=i+1;j<height.length;++j){
				int contain = Math.min(height[i],height[j])*(j-i);
				maxContain=(contain>maxContain)?contain:maxContain;
			}
		}
		return maxContain;
	}
	public static void main(String[] args){
		System.out.println(maxArea(new int[]{1,2,3,4,5}));
	}
}