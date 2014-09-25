package nyu.tlj.leetcode.solution;

public class MedianofTwoSortedArrays {
//import
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedianofTwoSortedArrays mat = new MedianofTwoSortedArrays();
		
		int[] a = {1,2};
		
		int[] b = {1,2};
		double res = mat.findMedianSortedArrays(a, b);
		
		System.out.println(res);

	}

	public double findMedianSortedArrays(int A[], int B[]) {
		
		int len = A.length + B.length;
		double res = 0.0;
		if( len % 2 == 0){
			res =  (  findKth(A, 0, B, 0,len/2) + findKth(A, 0, B, 0,len/2 + 1)  ) / 2.0;   
		}else{
			res = findKth(A, 0, B, 0,len/2 + 1);
		}
		
		
		return res;

	}
	
	private int findKth(int A[],int startA,int B[],int startB,int k) {

		if( startA >= A.length ){
			return B[startB + k -1 ];
			
		}
		if( startB >= B.length ){
			return A[startA + k -1];
		}
		
		if( k == 1 ) {
			return Math.min(A[startA], B[startB]);
		}
		int keyA = (startA + k/2 - 1) < A.length ?A[startA + k/2-1] : Integer.MAX_VALUE ;
		
		int keyB = (startB + k/2 -1 ) < B.length ?B[startB + k/2-1] : Integer.MAX_VALUE;
		
		if( keyA < keyB ){
			return findKth(A, startA + k/2, B, startB, k - k/2);
		}else{
			return findKth(A, startA, B, startB + k/2 , k - k/2);
		}
		
		
	}
	

}
