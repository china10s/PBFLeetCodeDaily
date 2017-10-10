public class Sqrt{
	public static int mySqrt(int x){
		if(x == 0){
			return 0;
		}

		int point = 0;
		while(point<=x/2+2){
			if(point*point > x || point>46340){
				System.out.println("pint:"+point);
				return point-1;
			}
			++point;
		}
		return 0;
	}
	public static void main(String [] args){
		if(mySqrt(2147395599)==46339){
			System.out.println("Sucess");
		}
		else{
			System.out.println("fail");
		}
		if(mySqrt(8)==2){
			System.out.println("Sucess");
		}
		else{
			System.out.println("fail");
		}
		if(mySqrt(2147395600)==46340){
			System.out.println("Sucess");
		}
		else{
			System.out.println("fail");
		}
	}
}