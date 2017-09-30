public class ValidParentheses1{
	public static boolean ValidParentheses(String strWords){
		if(strWords.length() == 0){
			return true;
		}
		int pointer = -1;
		char []chParams = strWords.toCharArray();
		while(strWords.length()>0){
			if (strWords.charAt(0) == '{' ||
				strWords.charAt(0) == '[' ||
			 	strWords.charAt(0) == '(' ){
				++pointer;
				chParams[pointer] = strWords.charAt(0);
			}
			else if (strWords.charAt(0) == '}' ||
			 	strWords.charAt(0) == ']' ||
			 	strWords.charAt(0) == ')' ){
				if(pointer >= 0){
					if (reverseChar(strWords.charAt(0)) != chParams[pointer]){
						return false;
					}
					else{
						--pointer;
					}
				}
				else{
					return false;
				}
			}
			strWords = strWords.substring(1,strWords.length());
		}
		
		if (pointer>=0){
			return false;
		}
		else{
			return true;
		}
	}
	public static Character reverseChar(Character oper){
		switch (oper){
			case '}':
				return '{';
			case ']':
				return '[';
			case ')':
				return '(';
		}
		return ' ';
	}
	public static void main(String[] args){
		if(ValidParentheses("{asdasd}a{asdas}")){
			System.out.println("success");
		}
		else{
			System.out.println("fail");
		}
		if(!ValidParentheses("{asdasda{asdas}")){
			System.out.println("success");
		}
		else{
			System.out.println("fail");
		}
		if(!ValidParentheses("asdasd}a{asdas}")){
			System.out.println("success");
		}
		else{
			System.out.println("fail");
		}
		if(ValidParentheses("{[()]}")){
			System.out.println("success");
		}
		else{
			System.out.println("fail");
		}
		if(!ValidParentheses("{([]}")){
			System.out.println("success");
		}
		else{
			System.out.println("fail");
		}
	}
}