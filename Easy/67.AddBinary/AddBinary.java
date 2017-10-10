public class AddBinary{
	public static String addBinary(String a,String b){
		int point = 0;
		int maxLen = a.length()<b.length()?b.length():a.length();
		StringBuilder resString=new StringBuilder();
		boolean isUpper=false;
		while(point < maxLen){
			int tmpA=0,tmpB=0;
			tmpA = point<a.length()?Integer.parseInt(String.valueOf(a.charAt(a.length()-point-1))):0;
			tmpB = point<b.length()?Integer.parseInt(String.valueOf(b.charAt(b.length()-point-1))):0;
			System.out.println("a:"+tmpA);
			System.out.println("b:"+tmpB);
			int tmpSum = tmpA+tmpB;
			tmpSum+=isUpper?1:0;
			isUpper = tmpSum>1?true:false;
			resString.insert(0,tmpSum%2);
			++point;
			System.out.println(tmpSum);
		}
		if(isUpper){
			resString.insert(0,"1");
		}
		System.out.println(resString.toString());
		return resString.toString();
	}
	public static void main(String[] args){
		if(addBinary("1010","1011").equals("10101")){
			System.out.println("sucess");
		}
		else{
			System.out.println("fail");	
		}
	}
}