package nyu.tlj.leetcode.solution;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInteger t = new ReverseInteger();
		System.out.println(t.reverse2(123));

	}

	public int reverse(int x) {
		int res = 0;
		int i = 0;
		int[] digits = new int[100];
		while ( x != 0 ) {
			res  = x%10;
			digits[i] = res;
			x = x /10;
			i++;
			
		}
		
		res = 0;
		int e = i - 1;
		for (int j = 0; j < i; j++) {
			res += digits[j] * Math.pow(10, e) ;
			e--;
			
		}
		return res;
	}
	
	


public int reverse2(int x){

    // Start typing your Java solution below
    // DO NOT write main() function

    int r = 0;

    while(x != 0) {
        r = r*10 + x % 10;
        x /= 10;
    }
    return r;
}


}
