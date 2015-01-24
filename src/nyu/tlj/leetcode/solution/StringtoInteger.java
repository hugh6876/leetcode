package nyu.tlj.leetcode.solution;

public class StringtoInteger {

	public static void main(String[] args) {
		StringtoInteger ai = new StringtoInteger();
		ai.atoi("+1a2");
		// TODO Auto-generated method stub

	}

	public int atoi(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}
		str = str.trim();
		long val = 0;
		int len = str.length();
		boolean isPos = true;
		char t = ' ';
		boolean isSigned = false;
		for (int i = 0; i < len; i++) {
			t = str.charAt(i);
			if ("+-".indexOf(t) > -1) {
				if (isSigned == true) {
					return 0;
				}

				isSigned = true;
				if (t == '+') {
					isPos = true;
				} else if (t == '-') {
					isPos = false;

				}

			} else if (Character.isDigit(t)) {
				val = val * 10 + Character.digit(t, 10);
				if (isPos == true && val > Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				} else if (isPos == false && (val * (-1)) < Integer.MIN_VALUE) {
					return Integer.MIN_VALUE;
				}
			} else if (Character.isDigit(t) == false) {
				break;
			}
		}
		if (isPos == false) {
			val = 0 - val;
		}
		return (int) val;

	}

}
