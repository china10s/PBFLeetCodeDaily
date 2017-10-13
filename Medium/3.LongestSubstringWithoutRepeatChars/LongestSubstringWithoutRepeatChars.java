public class LongestSubstringWithoutRepeatChars{
	public static int LongestSubstringWithoutRepeatChars(String strLong){
		int maxLen = 0,point = 0;
		while(strLong.length()-point > maxLen){
			int tmpBtn = point+1,tmpLen=1;
			while(tmpBtn < strLong.length()){
				String strTmp = strLong.substring(point,tmpBtn);
				if(strTmp.indexOf(strLong.charAt(tmpBtn))!=-1){
					break;
				}
				++tmpLen;
				++tmpBtn;
			}
			++point;
			maxLen = maxLen<tmpLen?tmpLen:maxLen;
		}
		return maxLen;
	}
	public static void main(String[] args){
		if (LongestSubstringWithoutRepeatChars("qqqqqq") == 1){
			System.out.println("success");
		}
		else{
			System.out.println("fail");
		}
	}
}