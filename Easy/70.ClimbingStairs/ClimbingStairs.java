public class ClimbingStairs{
	public static int climbingStairs(int n){
		if(n<=1){
			return 1;
		}
		return climbingStairs(n-1)+climbingStairs(n-2);
	}
	public static void main(String[] args){
		System.out.println(climbingStairs(44));
	}
}