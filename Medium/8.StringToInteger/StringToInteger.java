public class StringToInteger{
	public static int StringToInteger(String str){
		int num = 0,point = 0;
		boolean isNega = false;
		boolean isBegin = false;
		while (point < str.length()){
			char ch = str.charAt(point);
			if (ch == '+' || ch == '-'){
				if(ch == '-' && num == 0){
					isNega = true;
				}
				++point;
				isBegin = true;
				break;
			}
			else if(ch >= '0' && ch <= '9'){
				isBegin = true;
				break;
			}
			else if(ch == ' '){
				++point;
			}
			else{
				return 0;
			}
		}
		while (point< str.length()){
			char ch = str.charAt(point);
			if (ch == '+' || ch == '-'){
				return 0;
			}
			else if(ch >= '0' && ch <= '9'){
				if (isNega){
					if((-1)*num<Integer.MIN_VALUE/10 ||((-1)*num==Integer.MIN_VALUE/10 && ch-'0'>(Integer.MIN_VALUE%10*-1))){
						return Integer.MIN_VALUE;
					}
				}
				else {
					if (num>Integer.MAX_VALUE/10||(num==Integer.MAX_VALUE/10 && (ch-'0'>Integer.MAX_VALUE%10))){
						return Integer.MAX_VALUE;
					}
				}
				num=num*10+(ch-'0');
				isBegin = true;
			}
			else if(isBegin){
				break;
			}
			++point;
		}
		num = num * (isNega?-1:1);
		return (int)num;
	}
	public static void main(String[] args){
		System.out.println(StringToInteger(" b11228552307"));
	}
}