public class LongestCommonPrefix{
	public static String LongestCommonPrefix(String[] strs){
		if (strs.length == 1 ){
			return strs[0];
		}
		String strPrefix = "";
		for (int i=0;i<=strs.length-1;i=i+2){
			String strFore = strs[i];
			String strBack = (i == strs.length-1)?strs[i]:strs[i+1];
			System.out.println("strFore"+strFore);	
			System.out.println("strBack"+strBack);	
			int jFlag = -1;
			while (++jFlag>=0 && jFlag<strFore.length() && jFlag<strBack.length()){
				char chFore = strFore.charAt(jFlag);
				char chBack = strBack.charAt(jFlag);	

				if (strPrefix == ""){
					if (i != 0){
						return strPrefix;
					}
					if (chFore == chBack){
						continue;
					}
				}
				else{
					if(jFlag >= strPrefix.length()){
						break;
					}
					if (chFore == chBack && chFore == strPrefix.charAt(jFlag)){
						continue;
					}
				}
				break;
			}
			System.out.println("jFlag"+jFlag);	
			strPrefix = strFore.substring(0,jFlag);
			System.out.println("strPrefix"+strPrefix);
			if(strPrefix.length() == 0){
				return strPrefix;
			}
		}
		return strPrefix;
	}
	public static void main(String[] args){
		if(LongestCommonPrefix(new String[]{"aaa","aa","aaa"}).equals("aa")){
			System.out.println("success");
		}
		else{
			System.out.println("fail");	
		}
		if(LongestCommonPrefix(new String[]{"123","12","123"}).equals("12")){
			System.out.println("success");
		}
		else{
			System.out.println("fail");	
		}
		if(LongestCommonPrefix(new String[]{"1","1","11"}).equals("1")){
			System.out.println("success");
		}
		else{
			System.out.println("fail");	
		}
		if(LongestCommonPrefix(new String[]{"a"})=="a"){
			System.out.println("success");
		}
		else{
			System.out.println("fail");	
		}
	}
} 