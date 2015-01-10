package nyu.tlj.leetcode.solution;

public class FindPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findPeakElement(int[] num) {
		int max = Integer.MIN_VALUE;
		int index = 0;
		if(num == null || num.length == 0 ){
			return -1;
		}
		if( num.length == 1 || num[0] > num[1]){
			return 0;
		}
		
		for( int i = 1; i < num.length - 1; i++ ){
			if(num[i] > num[i-1] && num[i] > num[i+1] ){
				return i;
			}
		}
		
		if(num[num.length-1] > num[num.length-2]){
			return num.length-1;
		}
		
		return index;

	}

}
