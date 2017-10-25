public class IntegerToRoman{
	public static String IntegerToRoman(int num){
		if(num <1 ||num>3999){
			return "";
		}
		String strRes = "";
		int[] values = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] key = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int iPoint = 0;
		while(iPoint < values.length){
			if(num >= values[iPoint]){
				num-=values[iPoint];
				strRes+=key[iPoint];
			}
			else{
				++iPoint;
			}
		}
		return strRes;
	}
	public static void main(String[] args){
		System.out.println(IntegerToRoman(482));
	}
}