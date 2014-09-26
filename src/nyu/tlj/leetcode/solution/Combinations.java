package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Combinations ca = new Combinations();
		ca.combine(4, 2);

	}

	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		
		combineTool(res,path,n,k,1,0);
		
		//.out.println(res);
		return res;

	}
	
	public void combineTool(List<List<Integer>> res,List<Integer> path,int n,int k,int pos,int cnt) {
		if( cnt > k ){
			return;
		}
		if(cnt == k ){
			res.add(new ArrayList<Integer>(path));
			return;
		}
		for (int i = pos; i <= n; i++) {
			path.add(i);
			cnt++;
		
			combineTool(res,path,n,k,i+1,cnt);
			path.remove(path.size()-1);
			cnt--;
			
		}
		
	}

}
