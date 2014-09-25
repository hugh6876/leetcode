package nyu.tlj.leetcode.solution;

public class SearchinRotatedSortedArray {

	public static void main(String[] args) {
		SearchinRotatedSortedArray ss = new SearchinRotatedSortedArray();
		
		System.out.println( ss.search(new int[]{1}, 0)  );
	}

	public int search(int[] A, int target) {
	
		int l=0,r=A.length-1,mid=0;
		
		
		while(l<=r){
			mid = (l+r)/2;
			if(mid == l) {
				if(A[l] == target)return l;
				else if(A[r] == target )return r;
				else {
					return -1;
				}
				
			}
			
			if( A[mid]== target ){
				return mid;
			}else if( A[mid] > A[l]) {
				if(target >= A[l] && target < A[mid] ) {
					r = mid - 1;
				}else {
					l = mid;
				}
			}else {
				if(target <= A[r] && target > A[mid]) {
					l = mid + 1;
				}else{
					r = mid -1;
				}
			}
		}
//		if(A[l] == target) return l;
//		if(A[r] == target) return r;
		
		return -1;

	}

}
