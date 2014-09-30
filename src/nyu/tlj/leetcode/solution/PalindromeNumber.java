package nyu.tlj.leetcode.solution;
//http://blog.csdn.net/magisu/article/details/15497281
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeNumber paa = new PalindromeNumber();

		paa.isPalindrome(-1221);
	}

	public boolean isPalindrome(int x) {
		boolean isP = true;
		long xx = x;
		
		
		if (xx < 0) {
			return false;
			//xx = Math.abs(xx);
		}
		if (xx < 10) {
			return true;
		}

		long t = xx;
		long c = 0;// how many digits of xx
		long left = 0, right = 1;
		while (t > 0) {
			t = t / 10;
			c++;
		}

		left = (long) Math.pow(10, c - 1);

		while (left >= right) {
			if ((xx / left) % 10 != (xx / right) % 10) {
				return false;
			}
			left /= 10;
			right *= 10;
		}
		return isP;
	}

}
