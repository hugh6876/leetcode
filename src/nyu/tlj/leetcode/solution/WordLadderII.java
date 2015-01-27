package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class WordLadderII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WordLadderII wd = new WordLadderII();
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		wd.findLadders("a", "c", set);

	}

	Map<String, List<String>> paths = new HashMap<String, List<String>>();// store
	// all
	// path
	Map<String, Integer> steps = new HashMap<String, Integer>();// store
	// steps to
	// the
	// string;

	public List<List<String>> findLadders(String start, String end,
			Set<String> dict) {
		List<List<String>> res = new ArrayList<List<String>>();;

		bfs(start, end, dict, paths, steps);
		List<String> path = new ArrayList<String>();
		dfs(res, end, start, path);

		return res;
	}

	private void dfs(List<List<String>> res, String string, String start,
			List<String> path) {
		path.add(string);
		if (start.equals(string)) {
			Collections.reverse(path) ;
			res.add(new ArrayList<String>(path));
			Collections.reverse(path) ;
			
		} else {
			for(String s : paths.get(string) ) {
				
				if( steps.containsKey(s)   &&  (steps.get(s) == steps.get(string) - 1 )     ){
					dfs(res, s, start, path);
					path.remove(path.size()-1);
				}
				
			}
		}

	}

	public void bfs(String start, String end, Set<String> dict,
			Map<String, List<String>> paths, Map<String, Integer> steps) {
		for (String s : dict) {
			paths.put(s, new ArrayList<String>());
		}

		steps.put(start, 0);
		Queue<String> q = new LinkedList<String>();
		q.offer(start);

		while (!q.isEmpty()) {
			int len = q.size();
			for (int i = 0; i < len; i++) {
				String temp = q.poll();
				List<String> nexts = getNextCandiates(temp, dict);
				for (String next : nexts) {
					paths.get(next).add(temp);

					if (!steps.containsKey(next)) {
						steps.put(next, steps.get(temp) + 1);
						q.offer(next);
					}

				}

			}
		}

	}

	private List<String> getNextCandiates(String str, Set<String> dict) {
		List<String> candidates = new ArrayList<String>();
		char[] strs = str.toCharArray();
		for (int i = 0; i < strs.length; i++) {

			for (char t = 'a'; t <= 'z'; t++) {
				if (strs[i] == t) {
					continue;
				}
				strs[i] = t;
				String tmp = new String(strs);
				if (dict.contains(tmp)) {
					candidates.add(tmp);
				}
				strs = str.toCharArray();
			}
		}
		return candidates;

	}

}
