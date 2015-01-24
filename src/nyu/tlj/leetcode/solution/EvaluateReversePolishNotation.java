package nyu.tlj.leetcode.solution;

import java.util.Stack;

public class EvaluateReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int evalRPN(String[] tokens) {
		if( tokens == null || tokens.length == 0 ){
			return -1;
		}
		int val = 0;
		Stack<Integer> stack = new Stack<Integer>();
		String oprator = "+-*/";
		int a, b, c = 0;
		for(String str: tokens ){
			if(oprator.contains(str)){
				if(stack.size() < 2 ) {
					return -1;
				}
				b = stack.pop();
				a = stack.pop();
				
				if( str.equals("+") ) {
					c = a + b;
				}else if( str.equalsIgnoreCase( "-" )){
					c = a - b;
				}else if( str.equals( "*" )  ){
					c = a * b;
				}else if (str.equals("/") ) {
					c = a/b;
				}
				stack.push( c );
			}else {
				stack.push(Integer.valueOf(str));
			}
		}
		
		if( stack.size() != 1 ) {
			return -1;
		}
		val = stack.pop();
		
		return val;
	}

}
