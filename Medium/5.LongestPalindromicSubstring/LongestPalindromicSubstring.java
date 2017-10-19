public class LongestPalindromicSubstring{
	public static String LongestPalindromicSubstring(String s){
		int beforeLongest = 0;
		String strMaxLen = "";
		for (int i=0;i<s.length();++i){
			int beginTmp = 0;
			while (beginTmp <= i){
				String strTempLen = s.substring(beginTmp,i+1);
				if (isPalind(strTempLen)){
					if(beforeLongest < i-beginTmp+1){
						beforeLongest = i-beginTmp+1;
						strMaxLen = strTempLen;
					}
				}
				++beginTmp;
			}
		}
		return strMaxLen ;
	}
	public static boolean isPalind(String s){
		if (s.length() ==0){
			return true;
		}
		int iPoint = 0;
		while (iPoint <= s.length()/2){
			if (s.charAt(iPoint) != s.charAt(s.length()-iPoint-1)){
				return false;
			}
			++iPoint;
		}
		return true;
	}
	public static void main(String[] args){
		System.out.println(LongestPalindromicSubstring("iopsajhffgvrnyitusobwcxgwlwniqchfnssqttdrnqqcsrigjsxkzcmuoiyxzerakhmexuyeuhjfobrmkoqdljrlojjjysfdslyvckxhuleagmxnzvikfitmkfhevfesnwltekstsueefbrddxrmxokpaxsenwlgytdaexgfwtneurhxvjvpsliepgvspdchmhggybwupiqaqlhjjrildjuewkdxbcpsbjtsevkppvgilrlspejqvzpfeorjmrbdppovvpzxcytscycgwsbnmspihzldjdgilnrlmhaswqaqbecmaocesnpqaotamwofyyfsbmxidowusogmylhlhxftnrmhtnnljjhhcfvywsqimqxqobfsageysonuoagmmviozeouutsiecitrmkypwknorjjiaasxfhsftypspwhvqovmwkjuehujofiabznpipidhfxpoustquzyfurkcgmioxacleqdxgrxbldcuxzgbcazgfismcgmgtjuwchymkzoiqhzaqrtiykdkydgvuaqkllbsactntexcybbjaxlfhyvbxieelstduqzfkoceqzgncvexklahxjnvtyqcjtbfanzgpdmucjlqpiolklmjxnscjcyiybdkgitxnuvtmoypcdldrvalxcxalpwumfx"));
	}
}