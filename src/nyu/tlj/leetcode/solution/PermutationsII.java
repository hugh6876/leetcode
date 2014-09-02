package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {

	public static void main(String[] args) {
		PermutationsII p = new PermutationsII();
		
		 List<List<Integer>> res = p.permuteUnique(new int[]{3,3,0,3});
		
		p.output(res);
	}

	public List<List<Integer>> permuteUnique(int[] num) {
		
		
		 List<List<Integer>> res = new ArrayList<List<Integer>>();
		 List<Integer> path = new ArrayList<Integer>();
		 int[] flag = new int[num.length];
		 Arrays.sort(num);
		  
		  permuteUniqueGenerator(res,num,flag,path);
		 
		 return res;
	}
	
	
	public void permuteUniqueGenerator(List<List<Integer>> res,int[] num,int[] flag,List<Integer> path) {
		int preNum = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {
			if(flag[i] == 1){
				continue;
			}
			if(  preNum == num[i] ){
				continue;
			}
			
			path.add(num[i]);
			flag[i] = 1;
			if(path.size() == num.length){
				res.add(new ArrayList<Integer>(path));
				
			}
			
			permuteUniqueGenerator(res,num,flag,path);
			flag[i] = 0;
			path.remove(path.size()-1);
			preNum = num[i];//这种方法记录上次已经用过的数字，下一步放弃使用  必须要排序，才能去掉 3个以上相同的数字
			
		}
		

	}
	public void output(List<List<Integer>> res) {
		List<Integer> num;
		for (int i = 0; i < res.size(); i++) {
			num = res.get(i);
			for (int j = 0; j < num.size(); j++) {
				System.out.print(num.get(j) + " ,");
			}
			System.out.println();
			
		}
	}
	
	
	public void outputOneLine(List<Integer> res) {
		int num;
		for (int i = 0; i < res.size(); i++) {
			num = res.get(i);
			
			System.out.print(num +"  ,");
			
		}
		
		System.out.println();
	}

}
