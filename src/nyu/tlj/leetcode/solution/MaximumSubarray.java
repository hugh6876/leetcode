package nyu.tlj.leetcode.solution;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-2,1};
		System.out.println(maxSubArray(a));

	}
	//dive and conquer begin
	public static int maxSubArray(int[] A) {
		int max = 0;
		max = maxSubInOneSection(0,A.length-1,A);
		return max;
	}
	
	public static int maxSubCrossing (int l,int r,int mid,int[] a) {
		int suml = 0,maxl = Integer.MIN_VALUE;
		for (int i = mid; i >= l; i--) {
			suml += a[i];
			if(suml>maxl)
				maxl = suml;
		}
		int sumr = 0, maxr = Integer.MIN_VALUE;
		for (int i = mid +1; i <= r; i++) {
			sumr += a[i];
			if(sumr>maxr)
				maxr = sumr;
		}
		return maxl+maxr;
	}
	
	
	
	public static int maxSubInOneSection (int l,int r, int[] a) {
		if(l==r) {
			return a[l];
		}
		
		int mid = (l+r)/2,lmax=0,rmax=0,crossMax=0;
		int max = Integer.MIN_VALUE;
		lmax = maxSubInOneSection(l,mid,a);
		rmax = maxSubInOneSection(mid+1,r,a);
		crossMax = maxSubCrossing(l,r,mid,a);
		if(lmax>rmax){
			max = lmax;
		}else {
			max = rmax;
		}
		if(crossMax >max){
			max = crossMax;
		}
		return max;
	}
	//dive and conquer end
	/**
	 * DP solution
	 * @param A
	 * @return
	 */
//	public static int maxSubArray(int[] A) {
//		int max = A[0];
//		
//		int[] sum = new int[A.length];
//		
//		sum[0]=max;
//		
//		for (int i = 1; i < A.length; i++) {
//			if( (sum[i-1] + A[i]) > A[i] ) {
//				sum[i] = sum[i-1] + A[i];
//			}else {
//				sum[i] = A[i];
//			}
//			
//			if(sum[i] > max) {
//				max = sum[i];
//			}
//			
//		}
//		
//		return max;
//
//	}

}
