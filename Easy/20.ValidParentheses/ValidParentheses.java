import java.util.ArrayList;

public class ValidParentheses{
	public static boolean ValidParentheses(String strWords){
		if(strWords.length() == 0){
			return true;
		}
		ArrayList<Character> chParams = new ArrayList<Character>();
		while(strWords.length()>0){
			if (strWords.charAt(0) == '{' ||
				strWords.charAt(0) == '[' ||
			 	strWords.charAt(0) == '(' ){
				chParams.add(strWords.charAt(0));
			}
			else if (strWords.charAt(0) == '}' ||
			 	strWords.charAt(0) == ']' ||
			 	strWords.charAt(0) == ')' ){
				if(chParams.size() > 0){
					if (reverseChar(strWords.charAt(0)) != chParams.get(chParams.size()-1)){
						return false;
					}
					else{
						chParams.remove(chParams.size()-1);
					}
				}
				else{
					return false;
				}
			}
			strWords = strWords.substring(1,strWords.length());
		}
		
		if (chParams.size() > 0){
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