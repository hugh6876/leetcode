package nyu.tlj.leetcode.solution;

public class LargestBSTSubtree333 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int largestBSTSubtree(TreeNode root) {
		if(root == null) return 0;
		return largestBSTSubtreeHelper(root).nodeNum;
    }
	
	class Ret{
		boolean isBST = true;
		int nodeNum = 0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		int globalMax = Integer.MIN_VALUE;
	}
	
	public Ret largestBSTSubtreeHelper(TreeNode node) {
        if(node == null){
        	Ret ret = new Ret();
        	return ret;
        }
        
        Ret l = largestBSTSubtreeHelper(node.left);
       
        Ret r = largestBSTSubtreeHelper(node.right);
       
        int newNodeNum = l.nodeNum + r.nodeNum + 1;
        if(node.val > l.max && node.val < r.min && l.isBST && r.isBST){
        	l.globalMax = Math.max(l.globalMax, newNodeNum);
        	
        }else{
        	l.isBST = false;
        }
        l.globalMax = newNodeNum;
        return l;
    }

}
