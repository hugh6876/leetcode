package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.List;
//http://huntfor.iteye.com/blog/2060142
public class GrayCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ArrayList<Integer> grayCode(int n) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(n ==0){
			return null;
		}
		
		if( n<= 1){
			result.add(0);
			result.add(1);
			return result;
		}
		result = grayCode(n-1);
		
		ArrayList<Integer> rev = reverse(result);
		
		int x = 1<<(n-1);
		
		for (int i = 0; i < rev.size(); i++) {
			rev.set(i, x+rev.get(i));
		}
		result.addAll(rev);
		
		return result;
		
	}

	private ArrayList<Integer> reverse(ArrayList<Integer> resultold) {
		ArrayList<Integer> result = new ArrayList<Integer>(resultold);
		int len = result.size();
		int t;
		for (int i = 0, j = len-1; i < j; i++,j--) {
			t = result.get(j);
			result.set(j, result.get(i));
			result.set(i, t);
			
			
		}
		return result;
	}

}
