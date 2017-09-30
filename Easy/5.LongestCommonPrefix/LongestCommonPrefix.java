public class LongestCommonPrefix{
	public static String LongestCommonPrefix(String[] strs){
		String strPrefix = "";
		for (int i=0;i<=strs.length-2;++i){
			String strFore = strs[i];
			String strBack = strs[i+1];
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
						++jFlag;
						break;
					}
					if (chFore == chBack && chFore == strPrefix.charAt(jFlag)){
						continue;
					}
				}
				break;
			}
			strPrefix = strFore.substring(0,jFlag);
		}
		return strPrefix;
	}
	public static void main(String[] args){
		System.out.println(LongestCommonPrefix(new String[]{"1234","123","12"}));
		if(LongestCommonPrefix(new String[]{"1234","123","12"})=="12"){
			System.out.println("success");
		}
		else{
			System.out.println("fail");	
		}
	}
} 