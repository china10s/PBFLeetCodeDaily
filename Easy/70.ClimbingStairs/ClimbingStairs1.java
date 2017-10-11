public class ClimbingStairs1{
	public static int climbingStairs(int n){
		if(n<=1){
			return 1;
		}
		if(n==2){
			return 2;
		}
		int point = 3,stepa=1,stepb=2;
		while(point++<=n){
			stepb += stepa;
			stepa = stepb-stepa;
		}
		return stepb;
		
	}
	public static void main(String[] args){
		System.out.println(climbingStairs(44));
	}
}