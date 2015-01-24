package nyu.tlj.leetcode.solution;

import java.awt.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SimplifyPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplifyPath sa = new SimplifyPath();
		sa.simplifyPath("/a/./b/../../c/");
	}

	public String simplifyPath(String path) {
		
		if(path == null || path.length() == 0 ) {
			return null;
		}
		
		Deque<String> queue = new LinkedList<String>();
		path = path.trim();
		String[] paths = path.split("/+");
		StringBuilder res = new StringBuilder();
	
		
		for(String str:paths){
			if(str.equals("")) {
				continue;
			}
			if(str.equals(".")) {
				continue;
			}else if(str.equals("..")){
				if(queue.size() > 0 ) {
					queue.removeLast();
				}
			
			}else{
				queue.addLast(str);
			}
		}
		if( queue.isEmpty()){
			return "/";
		}
		res.append("/");
		while( !queue.isEmpty() ) {
			res.append(queue.pollFirst()).append("/");
		}
		String ress = res.toString();
		return ress.substring(0, ress.length()-1);

	}

}
