package nyu.tlj.leetcode.solution;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValid(String s) {

		Stack<Character> stack = new Stack<Character>();
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else {
				if(stack.isEmpty()){
					return false;
				}
				char t = stack.pop();
				if(c == ')' && t == '(') {
					continue;
				}
				if(c == '}' && t == '{'){
					continue;
				}
				if(c == ']' && t == '['){
					continue;
				}
				return false;
			}
		}
		if(stack.isEmpty() == false){
			return false;
		}
		return true;

	}

}
