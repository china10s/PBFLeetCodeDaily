import java.util.Arrays;

public class PlusOne{
	public static int[] PlusOne(int [] digits){
		int point = digits.length-1;
		while(point >=0){
			int numTmp = digits[point];
			digits[point] = ++numTmp%10;
			if (numTmp >= 10){
				--point;
			}
			else{
				break;
			}
		}
		if (point<0){
			int[] digitsRes = new int[digits.length+1];
			for(int i=0;i<digits.length;++i){
				digitsRes[i+1]=digits[i];
			}
			digitsRes[0]=1;
			return digitsRes;
		}
		else{
			return digits;
		}
	}
	public static void main(String[] args){
		if(Arrays.equals(PlusOne(new int[]{9}),new int[]{1,0})){
			System.out.println("sucess");
		}
		else{
			System.out.println("fail");
		}
	}
}