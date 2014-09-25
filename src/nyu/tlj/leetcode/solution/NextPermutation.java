package nyu.tlj.leetcode.solution;

import java.util.Collection;
import java.util.Collections;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public void nextPermutation(int[] num) {
        if( num == null || num.length == 0  ){
        	return ;
        }
    	
    	int len = num.length;
    	
    	
    	for (int i = len-1; i > 0; i--) {
			if( num[i] > num[i-1] ){
				
				for (int j = len-1; j >= i; j--) {
					if(num[j] > num[i-1]) {
						
						swap(num,i-1,j);
						reverse(num, i, len-1);
						return;
					}
				}
				
			}
		}
    	reverse(num, 0, len-1);
    	
    	
    }
    private void swap(int[] num,int i, int j){
    	int tmp;
    	tmp = num[i];
    	num[i] = num[j];
    	num[j] = tmp;
    }
    
    private void reverse(int[] num,int i, int j){
    	for(int bg=i,end=j;  bg < end; bg++,end--){
    		swap(num, bg, end);
    	}
    	
    }

}
