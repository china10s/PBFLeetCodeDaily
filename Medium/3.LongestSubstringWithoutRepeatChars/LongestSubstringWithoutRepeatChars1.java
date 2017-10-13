
import java.lang.Math;

public class LongestSubstringWithoutRepeatChars1{
	public static int LongestSubstringWithoutRepeatChars(String strLong){
		int[] idx = new int[128];
		int begin=0,len=0;
		for (int i=0;i<idx.length;++i){
			idx[i]=-1;
		}
		for (int i=0;i<strLong.length();++i){
			int iChar = strLong.charAt(i);
			if(idx[iChar]>=begin){
				begin = idx[iChar]+1;
			}
			idx[iChar]=i;
			len = Math.max(len,i-begin+1);
		}
		System.out.println("len:"+len);
		return len;
	}
	public static void main(String[] args){
		if (LongestSubstringWithoutRepeatChars("abcabcbb") == 3){
			System.out.println("success");
		}
		else{
			System.out.println("fail");
		}
	}
}