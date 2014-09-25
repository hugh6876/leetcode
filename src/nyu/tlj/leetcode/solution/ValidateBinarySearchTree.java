package nyu.tlj.leetcode.solution;

public class ValidateBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int lastVal = Integer.MIN_VALUE;
	
    public boolean isValidBST(TreeNode root) {
    	
    	if(root == null){
    		return true;
    	}
    	

    	
    	if( !isValidBST(root.left) ){
    		return false;
    	}
    	
    	if(lastVal >= root.val){
    		return false;
    	}
    	
    	lastVal = root.val;
    	
    	
    	if( !isValidBST(root.right) ) {
    		return false;
    	}
    	return true;
        
    }

}
