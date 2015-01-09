package nyu.tlj.leetcode.solution;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lengthOfLongestSubstring(String s) {
		int max = Integer.MIN_VALUE;
		if(s == null || s.length() == 0 ){
			return 0;
		}
		int left = 0;
		Set<Character> set = new HashSet<Character>();
		
		for( int i = 0; i < s.length(); i++ ){
			if(set.contains(s.charAt(i))){
				while( left < i && s.charAt(left) != s.charAt(i)){
					set.remove(s.charAt(left));
					left++;
				}
				left++;
			}else{
				set.add(s.charAt(i));
				max = Math.max(max, i - left + 1);
			}
			
		}
		
		return max;

	}

}
