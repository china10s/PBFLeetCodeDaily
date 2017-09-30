public class LongestCommonPrefix1{
	public static String LongestCommonPrefix1(String[] strs){
		if (strs == null || strs.length == 0){
			return "";
		}
		String strPrefix = strs[0];
		int iFlag = 0;
		for(iFlag = 1;iFlag<strs.length;++iFlag){
			while (!strs[iFlag].startsWith(strPrefix)){
				strPrefix = strPrefix.substring(0,strPrefix.length()-1);
				if (strPrefix.length() == 0){
					return "";
				}
			}
		}
		return strPrefix;
	}
	public static void main(String[] args){
		if(LongestCommonPrefix1(new String[]{"abc","ab","a"}).equals("a")){
			System.out.println("success");
		}
		else{
			System.out.println("fail");
		}
	}
}