package nyu.tlj.leetcode.solution;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordLadder wld = new WordLadder();
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		wld.ladderLength("a", "c", set);

	}
	public int ladderLength(String start, String end, Set<String> dict) {
		int step = 0;
		Queue<String> words = new LinkedList<String>();
		Queue<Integer> steps = new LinkedList<Integer>();
		words.offer(start);
		steps.offer(step);
		while( !words.isEmpty() ){
			String tmp = words.poll();
			char[] tps = tmp.toCharArray();
			step = steps.poll();
			if( tmp.equals(end)) {
				return step + 1;
			}
			for( int i = 0; i < tps.length; i++ ){
				
				for( char t = 'a'; t <= 'z'; t++ ) {
					if( t == tps[i] ) {
						continue;
					}
					tps[i] = t;
					String ts = new String(tps);
					if( dict.contains(ts) ) {
						words.offer(ts);
						dict.remove(ts);
						steps.add( step + 1 );
					}
					tps = tmp.toCharArray();
				}
			}
		}
		return step;
	}
	
	
	public int ladderLength2(String start, String end, Set<String> dict) {
		char[] starts ;
		int len = 0;
		String tmp;
		for (int i = 0; i < start.length(); i++) {
			for (char t = 'a'; t <= 'z'; t++) {
				if (start.charAt(i) == t) {
					continue;
				}
				starts = start.toCharArray();
				starts[i] = t;
				tmp = new String(starts);
				if(dict.contains(tmp)) {
					start = tmp;
					len++;
					if( start.equals(end)) {
						return len + 1;
					}
				}
			}
		}
		return 0;
	}
}
