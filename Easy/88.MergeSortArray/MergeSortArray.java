import java.util.Arrays; 

public class MergeSortArray{
	public static void merge(int[] num1,int m,int[]num2,int n){
		int ptrn1=0,ptrn2 = 0;
		while(ptrn2 <n&&ptrn1<m){
			while(ptrn1<m){
				if(num1[ptrn1] > num2[ptrn2]){
					insertInto(num1,++m,ptrn1,num2[ptrn2]);
					break;
				}
				else{
					++ptrn1;
				}
			}
			if(ptrn1 == m){
				break;
			}
			else{
				++ptrn2;
			}
		}
		System.out.println("m:"+m);
		System.out.println("ptr1:"+ptrn1);
		System.out.println("ptr2:"+ptrn2);
		while(ptrn1 == m && ptrn2<n){
			num1[ptrn1++] = num2[ptrn2++];
			++m;
		}
		System.out.println(Arrays.toString(num1));
	}	
	private static void insertInto(int[] num1,int length,int ptr,int num){
		int tempFore = num1[ptr];
		num1[ptr] = num;
		for(int i = ptr+1;i<length ;++i){
			int temp = num1[i];
			num1[i] = tempFore;
			tempFore = temp;
		}
	}
	public static void main(String[] args){
		merge(new int[]{1,2,3,0,0,0,0},3,new int[]{2,5,6},3);
		
	}
}