package nyu.tlj.leetcode.solution;
//http://blog.csdn.net/yutianzuijin/article/details/13161721
import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenerateParentheses ga = new GenerateParentheses();
		List<String> res = ga.generateParenthesis(2);
		res.size();

	}
	public List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<String>();
		
		generateParenthesisTool(n,n,res,"");
		
		return res;

	}
	
	public void generateParenthesisTool(int left,int right,List<String> res,String s) {
		if( left==0 && right==0){
			res.add(s);
			return;
		}
		if(left > 0 ){
			generateParenthesisTool(left-1,right,res,s + "(");
		}
		if(left < right && right > 0){
			generateParenthesisTool(left,right-1,res,s + ")");
		}
	}


}
