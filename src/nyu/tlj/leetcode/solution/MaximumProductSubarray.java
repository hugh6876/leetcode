package nyu.tlj.leetcode.solution;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		
		MaximumProductSubarray t = new MaximumProductSubarray();
		t.maxProduct(new int[]{2,3});
		// TODO Auto-generated method stub

	}

	public int maxProduct(int[] A) {
		if( A == null || A.length == 0 ){
			return 0;
		}
		
		int globalMax = Integer.MIN_VALUE;
		int min , max ;
		globalMax = min = max = A[0];
		int n1,n2;
		for( int i = 1; i < A.length; i++ ){
			n1 = min * A[i];
			n2 = max * A[i];
			min = Math.min(A[i] ,Math.min(n1, n2) );
			max = Math.max(A[i], Math.max(n1, n2) );
			
			
//			min = Math.min(A[i],min * A[i]) ;
//			max = Math.max(min*A[i], Math.max(A[i], max * A[i]) );
			
			if( globalMax < max){
				globalMax = max;
			}
			
			
		}
		
		
		return globalMax;
		

	}
}
