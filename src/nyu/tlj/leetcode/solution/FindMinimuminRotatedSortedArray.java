package nyu.tlj.leetcode.solution;

public class FindMinimuminRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMinimuminRotatedSortedArray faz = new FindMinimuminRotatedSortedArray();
		faz.findMin(new int[] { 1, 2 });

	}

	public int findMin(int[] num) {
		if (num == null || num.length == 0) {
			return 0;
		}

		int l = 0, h = num.length - 1, mid = 0;
		if( num.length == 1){
			return num[0];
		}
		if(num.length == 2){
			return Math.min(num[0],num[1]);
		}
		
		while( l < h - 1) {
			mid = l + (h-l) / 2;
			if( num[mid] > num[l] && num[mid] < num[h]) {
				return num[l];
			}
			if( num[mid] > num[h]){
				l = mid;
			}else if(num[mid] < num[h]){
				h = mid;
			}
			
		}
		
		return Math.min(num[mid], num[h]);

	}

	//
	//
	//
	//
	// public int findMin(int[] num) {
	// if (num == null || num.length == 0) {
	// return 0;
	// }
	//
	// int l = 0, h = num.length - 1, mid;
	//
	// while (l <= h) {
	// if (l >= h) {
	// return num[l];
	// }
	// mid = l + (h - l) / 2;
	// if (num[mid] > num[h]) {
	// l = mid + 1;
	// } else {// ( num[mid] < num[h]) {
	// if (mid > 0 && num[mid] < num[mid - 1]) {
	// return num[mid];
	// }
	// h = mid - 1;
	// }
	//
	// }
	// return -1;
	//
	// }
}
