package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.List;
//important
public class SumRoottoLeafNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		a.left = b; b.left = b.right = null;
		a.right = c; c.left = c.right = null;
		
		SumRoottoLeafNumbers sa = new SumRoottoLeafNumbers();
		sa.sumNumbers(a);

	}
	
	
	 public int sumNumbers(TreeNode root) {
		 int resnum = 0;
		 List<String> res = new ArrayList<String>();
		 String path = new String();
		 sumNumbersTool(root,path,res);
		 resnum = getSum(res);
		 
		 return resnum;
	        
	 }
	 
	 //another version better. begin
	 //dfs(root,0);
	 private int dfs(TreeNode root, int sum) {
		 if(root == null){
			 return 0;
		 }
		 sum = 10*sum + root.val;
		 
		 if(root.left == null && root.right == null){
			 return sum;
		 }
		 
		 
		 return dfs(root.left, sum) + dfs(root.right, sum);
		 
	 }
	 
	 //another version better. end
	 
	 
	 
	 private int  getSum(List<String> res){
		 int sum = 0;
		 for (int i = 0; i < res.size(); i++) {
			 sum += Integer.parseInt(res.get(i));
			
		}
		 return sum;
		 
		 
	 }
	 public void sumNumbersTool(TreeNode root,String path, List<String> res) {
		 if(root == null ){
			 return ;
		 }
		 path += (root.val);
		 
		 if(root.left == null && root.right == null ){
			 res.add(path.toString());
		 }
		 
		 sumNumbersTool(root.left,path,res);
		// path = path.substring(0, path.length()-1);
		 sumNumbersTool(root.right,path,res);
		 path = path.substring(0, path.length()-1);
	 }

}
