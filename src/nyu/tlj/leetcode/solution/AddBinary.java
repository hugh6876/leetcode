package nyu.tlj.leetcode.solution;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "11";
		String b = "11",res;
		
		AddBinary ada = new AddBinary();
		res =  ada.addBinary(a, b);
		
		
		System.out.println(res);

	}

	public String addBinary(String a, String b) {
		StringBuilder res = new StringBuilder();
		int lena = a.length() - 1, lenb = b.length() - 1;
		int carry = 0,sum, numa, numb;
		while(lena >= 0 || lenb >= 0 ){
			sum = 0;
			numa = lena < 0 ? 0 : a.charAt(lena--) -  '0';
			numb = lenb < 0 ? 0 : b.charAt(lenb--) -  '0';
			sum = numa + numb + carry;
			//System.out.println(sum);
			carry = 0;
			if( sum >= 2 ) {
				carry = 1;
				sum = sum - 2;
			}
			res.append(sum);
		}
		if( carry == 1 ) {
			res.append(1);
		}
		
		return res.reverse().toString();
	}

}
