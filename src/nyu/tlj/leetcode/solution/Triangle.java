package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.ls.LSException;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(-1);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(2);l2.add(3);
		List<Integer> l3 = new ArrayList<Integer>();
		l3.add(1);l3.add(-1);l3.add(-3);
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		l.add(l1);l.add(l2);l.add(l3);
		
		
		Triangle ta = new Triangle();
		
		ta.minimumTotal(l);

	}

	public int minimumTotal(List<List<Integer>> triangle) {
		int minSum = Integer.MAX_VALUE;
		int n = triangle.size();
		int[][] mem = new int[n][n];
		mem[0][0] = triangle.get(0).get(0);
		for(int i=1; i < triangle.size(); i++){
			mem[i][0] = mem[i-1][0] + triangle.get(i).get(0);
		}
		for (int i = 1; i < triangle.size(); i++) {
			for (int j = 1; j < triangle.get(i).size(); j++) {
				if(j == triangle.get(i).size() -1){
					mem[i][j] =  mem[i-1][j-1] + triangle.get(i).get(j);
				}else{
					mem[i][j] = Math.min(mem[i-1][j] + triangle.get(i).get(j), mem[i-1][j-1] + triangle.get(i).get(j));
				}
			}
			
			
		}
		
		for(int i=0; i < triangle.get(triangle.size() - 1).size(); i++ ){
			if(minSum > mem[triangle.size()-1][i] ){
				minSum = mem[triangle.size()-1][i];
			}
		}
		
		return minSum;

	}

}
