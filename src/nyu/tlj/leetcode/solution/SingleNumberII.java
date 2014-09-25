package nyu.tlj.leetcode.solution;

public class SingleNumberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1,1,2,2,2,4};
		int result = 0;
		result = singleNumber(a);
		System.out.println(result);

	}

	/**better sulution
	 * http://fisherlei.blogspot.com/2013/11/leetcode-single-number-ii-solution.html
	 * 
        int result = 0;
        
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                count += ((A[j] >> i) & 1); //统计每一位的个数
            }
            result |= ((count % 3) << i);   //取余放回result
        }
        
        return result;﻿
	 * @param A
	 * @return
	 */
	public static int singleNumber(int[] A) {
	        
	        int[] cnt = new int[32];
	        int result =0;
	        
	        for (int i = 0; i < A.length; i++) {
	        	for (int j = 0; j < cnt.length; j++) {
	        		cnt[j] += (A[i] >> j) & 1;
				}
			}
	        for (int i = 0; i < cnt.length; i++) {
				result |= (cnt[i] % 3) << i;
				
			}
	        return result;
	        
	    }
}
