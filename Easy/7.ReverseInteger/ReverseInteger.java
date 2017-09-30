import java.lang.Math;

public class ReverseInteger{
	public static int reverseInteger(int num){
		// 判断极值
		if (num<-2147483648 || num >2147483647){
			return 0;
		}
		long value = 0;
		int flag = 0;
		for(int i =0;i<11;++i){
			int nCurNum = num/(int)Math.pow(10,i);
			nCurNum = nCurNum%(int)Math.pow(10,1);
			if (nCurNum!=0){
				value+=nCurNum*Math.pow(10,11-i);
				flag = i;
			}
		}
		value*=Math.pow(0.1,11-flag);
		if (value<-2147483648 || value >2147483647){
			return 0;
		}
		return (int)value;
	}
	public static void main(String[] args){
		if(reverseInteger(-1234567899)==0){
			System.out.println("success");
		}
		else{
			System.out.println("fail");	
		}
		if(reverseInteger(10)==1){
			System.out.println("success");
		}
		else{
			System.out.println("fail");	
		}
	}
}