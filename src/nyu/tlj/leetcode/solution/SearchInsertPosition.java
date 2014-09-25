package nyu.tlj.leetcode.solution;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchInsertPosition ss = new SearchInsertPosition();
		System.out.println( ss.searchInsert3(new int[]{1,3,5,5,5,7,7},6)  );
	}
	//binary search is much better. remember the position to be inserted is low.
	public int searchInsert2(int[] A, int target) {
		int low=0,high=A.length-1,mid=0;
		while(low<=high){
			
			if( low == high ) {
				System.out.println("high == low" + low);
			}
			mid = (low+high)/2;
			if(A[mid] == target){
				//System.out.println("low:"+low + " high: " + high);
				return mid;
			}
			else if(A[mid]<target) {
				low = mid +1;
				
			}else {
				high = mid -1;
			}
		}
		
		//System.out.println("low:"+low + " high: " + high);
		return low;
	}
	
	
	
	public int searchInsert(int[] A, int target) {
		
		int l = 0, h = A.length - 1;
		int mid = 0;
		
	
//		if( target < A[0] ) {
//			return 0;
//		}
		while( l + 1 < h ) {
			mid = l + ( h - l ) / 2 ;
			
			if(A[mid] == target ) {
				return mid;
			} else if ( target > A[mid]) {
				l = mid;
			} else {
				h = mid;
			}
		}
		
		if(A[h] == target ) {
			return h;
		}
		if(A[l] == target ) {
			return l;
		}
		if(A[h] < target ) {
			return h + 1;
		}
		if(A[l] < target) {
			return l + 1;
		}
		
		
		return l;
	}
	
	
	public int searchInsert3(int[] A, int target) {
        int start = 0;
        int end = A.length - 1;
        int mid;
        
//        if (target < A[0]) {
//            return 0;
//        }
        // find the last number less than target
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (A[mid] == target) {
                return mid;
            } else if (A[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        System.out.println("L: " + start + "  H:" + end);
        if (A[end] == target) {
            return end;
        }
        if (A[end] < target) {
            return end + 1;
        }
        if (A[start] == target) {
            return start;
        }
        return start + 1;
    }

}

	
