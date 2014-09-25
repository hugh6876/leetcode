package nyu.tlj.leetcode.solution;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int removeElement(int[] A, int elem) {
		
		if( A == null || A.length == 0 ){
			return 0;
		}
		int len = A.length;
		Arrays.sort(A);
		int first = -1, second = -1;
		for (int i = 0; i < A.length; i++) {
			if(elem == A[i]){
				len --;
				if(first == -1){
					first = i;
				}
				if( first != -1 ) {
					second = i;
				}
			}
		}
		if( first == -1 ){
			return A.length;
		}
		
		for (int i = second+1; i < A.length; i++) {
			A[first++] = A[i];
			
		}
		
		
		return len;
	}

}
