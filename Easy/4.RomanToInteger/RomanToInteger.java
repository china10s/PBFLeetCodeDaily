public class RomanToInteger{
	public static int romanToInteger(String strNum){
		if (strNum == "" || strNum == null){
			return 0;
		}
		//单数
		if (strNum.length() == 1){
			return getValueFromChar(strNum.charAt(0));
		}
		int num = 0;
		int lagerValue = 0;
		//其他
		while(strNum.length()>=2){
			int iLength = strNum.length();
			char lastChar = strNum.charAt(iLength-1);
			char lasterChar = strNum.charAt(iLength-2);
			int lastInt = getValueFromChar(lastChar);
			int lasterInt = getValueFromChar(lasterChar);
			
			if (num == 0){
				if (lasterInt<lastInt){
					num=lastInt-lasterInt;
				}
				else{
					num=lastInt+lasterInt;
				}
			}
			else{
				if (lasterInt<lagerValue){
					num=num-lasterInt;
				}
				else{
					num=num+lasterInt;
				}
			}
			strNum = strNum.substring(0,iLength-1);
			if(num <1 || num >3999){
				return num;
			}
			if(lagerValue < ((lasterInt>lastInt)?lasterInt:lastInt)){
				lagerValue = (lasterInt>lastInt)?lasterInt:lastInt;
			}
		}
		return num;
	}
	public static int getValueFromChar(char chFlag){
		int num = 0;
		switch(chFlag){
			case 'I':
				num = 1;
				break;
			case 'V':
				num = 5;
				break;
			case 'X':
				num = 10;
				break;	
			case 'L':
				num = 50;
				break;	
			case 'C':
				num = 100;
				break;	
			case 'D':
				num = 500;
				break;
			case 'M':
				num = 1000;
				break;
		}
		return num;
	}

	public static void main(String[] args){
		if(romanToInteger("C")==100){
			System.out.println("success");
		}
		else{
			System.out.println("fail");	
		}
		if(romanToInteger("MMMDLXXXVI")==3586){
			System.out.println("success");
		}
		else{
			System.out.println("fail");	
		}
		if(romanToInteger("MMCDXCIII")==2493){
			System.out.println("success");
		}
		else{
			System.out.println("fail");	
		}
	}
}