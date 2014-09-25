package nyu.tlj.leetcode.solution;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {

	}
	
	public int removeDuplicates(int[] A) {
		if( A == null || A.length == 0){
			return 0;
		}
		
		int size = 0;
		
		for (int i = 0; i < A.length; i++) {
			
			if(A[size] != A[i]) {
				A[++size] = A[i];
			}
			
		}
		return size + 1;

	}

//	public int removeDuplicates(int[] A) {
//		
//		int l=0,h=0;
//		if(A.length == 1) {
//			return 1;
//		}
//		
//		
//		for (int i = 0; i < A.length - 1; i++) {
//			
//			if( A[i] == A[i+1] ) {
//				l = i;
//				h = i + 1;
//				
//				while( h < A.length && A[h] == A[h-1] ) {
//					
//					h++;
//				}
//				h--;
//				
//				while(h<A.length) {
//					A[l] = A[h];
//					
//					l++;
//					
//					h++;
//				}
//				
//				
//			}
//			
//		}
//		
//		
//		
//		return h - l;
//
//	}

}
