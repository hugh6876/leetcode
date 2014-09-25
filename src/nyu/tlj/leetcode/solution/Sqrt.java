package nyu.tlj.leetcode.solution;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sqrt sa = new Sqrt();
		sa.sqrt2(5);

	}

	public int sqrt(int x) {
		long l=0,h=x,m=0;
		while( h >= l ) {
			m = l + (h-l)/2;
			if( x < (m*m) ){
				h = m - 1;
			}else if( x > (m*m) ){
				l = m + 1;
			}else{
				return (int) m;
			}
		}
		
		return (int)l;
	}
	
	
	public int sqrt2(int x) {
        long lo = 0;
        long hi = x;

        while (hi >= lo) {     
            long mid = lo+(hi-lo)/2;
            if (x < mid * mid) {
                hi = mid-1;      // not hi = mid
            } else {
                lo = mid+1;  
            }
        }
        return (int) hi;
    }

}
