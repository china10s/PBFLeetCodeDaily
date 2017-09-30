import java.lang.Math;

public class ReverseInteger1{
	public static int reverseInteger(int num){
		long value = 0;
		while(num!=0){
			int tmp = num%10;
			num = num/10;
			value = value*10+tmp;
			if(value < Integer.MIN_VALUE || value > Integer.MAX_VALUE){
				return 0;
			}
		}
		return (int)value;
	}
	public static void main(String[] args){
		if(reverseInteger(2147483647)==0){
			System.out.println("success");
		}
		else{
			System.out.println("fail");	
		}
		if(reverseInteger(1)==1){
			System.out.println("success");
		}
		else{
			System.out.println("fail");	
		}
	}
}