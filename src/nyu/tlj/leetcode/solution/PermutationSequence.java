package nyu.tlj.leetcode.solution;

public class PermutationSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PermutationSequence paa = new PermutationSequence();
		System.out.println( paa.getPermutation(3, 1)  );

	}

	public String getPermutation(int n, int k) {
		int factor = 1, digit = 1;
		boolean[] digits = new boolean[n+1];
		StringBuilder result = new StringBuilder();
		
		for(int i = 1; i <= n; i++){
			factor *= i;
		}
		int cnt = 0;
		for(int i = n; i >= 1; i--){
			cnt = 0;
			factor = factor / i;
			
			digit = (k - 1)/factor + 1;
			k = (k-1) % factor + 1;
			
			for( int j = 1; j <= n; j++){
				if(digits[j] == false){
					cnt++;
					if( cnt == digit ){
						digits[j] = true;
						result.append(j);
					
						break;
					}
				}
			}
		}
		
		return result.toString();

	}

}
