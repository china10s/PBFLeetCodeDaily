import java.lang.Math;
import java.util.Arrays;

public class MedianOfTwoSortedArrays{
	public static double MedianOfTwoSortedArrays(int[] nums1,int[] nums2){
		int m = nums1.length;
		int n = nums2.length;	
		int k = m+n;
		if(k%2==1){
			return findKth(nums1,m,nums2,n,k/2+1);
		}
		else{
			return ((findKth(nums1,m,nums2,n,k/2)+findKth(nums1,m,nums2,n,k/2+1))/2);
		}
	}
	public static double findKth(int a[],int m,int[] b,int n,int k){
		if (m>n){
			return findKth(b,n,a,m,k);
		}
		if (m==0){
			return b[k-1];
		}
		if(k==1){
			return Math.min(a[0],b[0]);
		}
		int pa = Math.min(k/2,m),pb=k-pa;
		if (a[pa-1] < b[pb-1]){
			int[] aRes=new int[m-pa];
			System.arraycopy(a,pa,aRes,0,m-pa);
			return findKth(aRes,m-pa,b,n,k-pa);
		}
		else if (a[pa-1] > b[pb-1]){
			int[] bRes=new int[n-pb];
			System.arraycopy(b,pb,bRes,0,n-pb);
			return findKth(a,m,bRes,n-pb,k-pb);
		}
		else{
			return a[pa-1];
		}
	}
	public static void main(String [] args){
		System.out.println(MedianOfTwoSortedArrays(new int[] {1,3,5,7,9},new int[] {2,4,6,8,10}));
	}
}