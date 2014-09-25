package nyu.tlj.leetcode.solution;

public class SearchinRotatedSortedArrayII {

	public static void main(String[] args) {

		SearchinRotatedSortedArrayII ss = new SearchinRotatedSortedArrayII();

		System.out.println(ss.search(new int[] { 1,1,3,1 }, 3));

	}

	public boolean search(int[] A, int target) {

		int l=0,r=A.length-1,mid=0;
		
		
		while(l<=r){
			mid = (l+r)/2;
			if(mid == l) {
				if(A[l] == target)return true;
				else if(A[r] == target )return true;
				else {
					return false;
				}
				
			}
			
			if( A[mid]== target ){
				return true;
			}else if( A[mid] > A[l]) {
				if(target >= A[l] && target < A[mid] ) {
					r = mid - 1;
				}else {
					l = mid;
				}
			}else{
				if(target <= A[r] && target >= A[mid]) {
					l = mid + 1;
				}else{
					r = mid -1;
				}
			}
		}
		
		return false;

	}
}
