package nyu.tlj.leetcode.solution;

public class FindMinimuminRotatedSortedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findMin(int[] num) {
		
		if( num == null || num.length == 0 ) {
			return 0;
		}
		if( num.length == 1 ){
			return num[0];
		}
		if( num.length == 2 ){
			return Math.min(num[0], num[1]);
		}
		
		int l = 0, h = num.length - 1, mid = 0;
		
		while( l < h - 1 ){
			mid = l + (h - l)/2;
			if(num[l] < num[h]){
				return num[l];
			}
			
		
			if( num[mid] > num[l] ) {
				l = mid;
			} else if(num[mid] < num[l] ) {
				h = mid;
			} else {
				l++;
			}
			
		}
		return Math.min(num[mid], num[h]);

	}

}
