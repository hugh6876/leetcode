package nyu.tlj.leetcode.solution;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxArea(int[] height) {
		if(height == null || height.length == 1){
			return 0;
		}
		int max = Integer.MIN_VALUE;
		
		int i=0,j=height.length-1;
		int area = 0;
		while(i<j){
			area = Math.min(height[i],height[j]) * (j-i);
			if(area>max){
				max = area;
			}
			if(height[i] < height[j]){
				i++;
			}else{
				j--;
			}
			
			
		}
		
		return max;
		
		
		
	}

}
