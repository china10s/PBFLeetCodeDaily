public class CountAndSay{
	public static String CountAndSay(int n){
		return CountAndSayInner(--n,"1");
	}

	public static String CountAndSayInner(int n ,String strCount){
		System.out.printf("strCount"+strCount);
		if (n == 0){	
			return strCount;
		}
		String strCountNext = "";
		char foreChar = ' ';
		int nCount = 0;
		while (strCount.length() != 0){
			System.out.printf("strCount:"+strCount);
			if (foreChar == ' '){
				foreChar = strCount.charAt(0);
			}
			char temp = strCount.charAt(0);
			if (foreChar != temp ){
				strCountNext = strCountNext+nCount+foreChar;
				foreChar = temp;
				nCount = 1;
			}
			else{
				++nCount;
			}
			strCount = strCount.substring(1,strCount.length());
		}
		if (foreChar != ' '){
			strCountNext = strCountNext+nCount+foreChar;
		}
		return CountAndSayInner(--n,strCountNext);
	}

	public static void main(String[] args){
		if (CountAndSay(1).equals("1")){
			System.out.println("sucess");
		}
		else{
			System.out.println("fail");
		}
		if (CountAndSay(5).equals("111221")){
			System.out.println("sucess");
		}
		else{
			System.out.println("fail");
		}
	}
}