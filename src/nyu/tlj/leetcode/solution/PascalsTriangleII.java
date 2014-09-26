package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> getRow(int rowIndex) {
		List<Integer> res = new ArrayList<Integer>();
		int[] num = new int[rowIndex+1];
		for( int i = 0; i <= rowIndex; i++ ){
			num[i] = 0;
		}
		num[0] = 1;
		
		for(int i = 1; i <= rowIndex; i++ ){
			for( int j = rowIndex; j >= 1; j-- ){
				
				num[j] = num[j] + num[j-1];
				
				
			}
		}
		
		for(int i = 0; i <= rowIndex; i++ ){
			res.add(num[i]);
		}
		
		return res;

	}

}
