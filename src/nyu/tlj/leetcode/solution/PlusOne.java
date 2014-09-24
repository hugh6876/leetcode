package nyu.tlj.leetcode.solution;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusOne sOne = new PlusOne();
		sOne.plusOne(new int[]{9,9});

	}

	public int[] plusOne(int[] digits) {
		int index = digits.length - 1;
		int sum = 0;
		int carryOn = 1;
		sum = 1 + digits[index];
		if(sum < 10){
			digits[index] = sum;
			return digits;
		}else{
		    digits[index] = sum % 10;
		}
		index--;
		while(index>=0){
			sum = digits[index] + carryOn;
			if(sum < 10){
				digits[index] = sum;
				return digits;
			}else {
				digits[index] = sum % 10;
				
			}
			index--;
		}
		if(index == -1){
			int[] digitNew = new int[digits.length+1];
			for (int i = 1; i < digitNew.length; i++) {
				digitNew[i] = digits[i-1];
				
			}
			digitNew[0] = 1;
			return digitNew;
		}
		
		return digits;
		
		

	}
}
