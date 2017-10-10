public class LengthOfLastWord{
	public static int LengthOfLastWord(String words){
		int pointUnSpace = 0,wordLength = 0;
		for(int i =0;i < words.length();++i){
			if (words.charAt(i) == ' '){
				if(i-pointUnSpace != 0){
					wordLength = i-pointUnSpace;
				}
				pointUnSpace = i+1;
			}
			else{
				if (i == words.length()-1){
					wordLength = words.length() - pointUnSpace;
				}
			}
		}
		System.out.println(wordLength);
		return wordLength;
	}
	public static void main(String[] args){
		if (LengthOfLastWord("123 ") == 3){
			System.out.println("sucess");
		}
		else{
			System.out.println("fail");
		}
		if (LengthOfLastWord("123 asda") == 4){
			System.out.println("sucess");
		}
		else{
			System.out.println("fail");
		}
		if (LengthOfLastWord("a") == 1){
			System.out.println("sucess");
		}
		else{
			System.out.println("fail");
		}
		if (LengthOfLastWord("a ") == 1){
			System.out.println("sucess");
		}
		else{
			System.out.println("fail");
		}
		if (LengthOfLastWord("b   a    ") == 1){
			System.out.println("sucess");
		}
		else{
			System.out.println("fail");
		}
	}
}