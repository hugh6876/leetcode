package nyu.tlj.leetcode.solution;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int singleNumber(int[] A) {
		 int res = 0;
		 for (int i = 0; i < A.length; i++) {
			res ^= A[i];
		}
	        return res;
	    }

}
