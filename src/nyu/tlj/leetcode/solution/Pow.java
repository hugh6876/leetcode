package nyu.tlj.leetcode.solution;

public class Pow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public double pow(double x, int n) {
		double res = 0.0;
		if( n < 0 ) {
			n = Math.abs(n);
			res = powTool(x, n);
			res = 1.0 / res ;
		}else {
			res = powTool(x, n);
		}
		
		return res;

	}

	public double powTool(double x, int n) {

		double res = 0.0;

		
		if (n == 0) {
			return 1.0;
		} else if (n == 1) {
			return x;
		} 
		
		res = pow(x, n / 2);
		
		if( n %2 == 0 ){
			res = res * res;
		}else{
			res = res * res * x;
		}

		return res;

	}

}
