package nyu.tlj.leetcode.solution;

public class MergeSortedArray {
//important
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public void merge2(int A[], int m, int B[], int n) {
		int last = m + n;
		
		
		while(m > 0 && n > 0 ) {
			if(A[m-1] > A[n-1 ]) {
				A[--last] = A[m-1];
				m--;
			}else {
				A[--last] = B[n-1];
				n--;
			}
		}
		
		while(n>0){
			A[--last] = B[n-1];
			n--;
		}
	}
	
	
	
	
	
	

	public void merge(int A[], int m, int B[], int n) {
		if(B == null || B.length == 0){
			return;
		}
		
		int last = m+n;
		
		int i = m-1;
		int j = n-1;
	
		while(last > 0) { 
			if(i == -1 ){
				A[--last] = B[j--];
				continue;
			}
			if(j == -1 ){
				A[--last] = A[i--];
				continue;
			}
			
			if(A[i] > B[j]) {
				A[--last] = A[i--];
				
			}else{
				A[--last] = B[j--];
			}
		}
	}

}
