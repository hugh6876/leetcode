package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.List;


public class BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 97;
		char b = '#';
		a = b;
		System.out.println(a);

	}
    public List<Integer> inorderTraversal(TreeNode root) {
    	
    	List<Integer> result = new ArrayList<Integer>();
    	
    	inorderTraversalRecursive(root,result);    	
    	return result;
    }

    public void inorderTraversalRecursive(TreeNode node,List<Integer> result){
    	if(node != null && node.val != 35) {
    		inorderTraversalRecursive(node.left, result);
    		result.add(node.val);
    		inorderTraversalRecursive(node.right, result);
    	}
    }
    
}
