package nyu.tlj.leetcode.solution;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	public int climbStairs(int n) {
//		if(n==1) return 1;
//		else if(n==2) return 2;
//		
//		return climbStairs(n-1) + climbStairs(n-2);
//		
//	}
	
	//no recursive
	public int climbStairs(int n) {
		int f1 = 1, f2=2;
		int res = 0;
		
		if(n==1)return 1;
		else if(n==2) return 2;
		for (int i = 3; i <= n; i++) {
			res = f1 + f2;
			f1 = f2;
			f2 = res;
			
		}
		return res;
		
	}

}
