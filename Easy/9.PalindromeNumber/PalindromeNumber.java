public class PalindromeNumber{
	public static boolean PalindromeNumber(int num){
		if(num < Integer.MIN_VALUE || num > Integer.MAX_VALUE){
			return false;
		}
		if((num %10 ==0 && num != 0) || num <0){
			return false;
		}
		if(num>=0 && num<=9){
			return true;
		}
		int operNum = 0;
		while(operNum < num){
			operNum = operNum*10+num%(int)10;
			num = num/10;
		}
		//判断是否是回文字的两部分
		return num==operNum || num==operNum/10;
	}
	public static void main(String[] args){
		if(PalindromeNumber(1)==true){
			System.out.println("success");
		}
		else{
			System.out.println("fail");	
		}
	}
}