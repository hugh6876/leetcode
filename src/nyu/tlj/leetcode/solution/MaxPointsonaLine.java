package nyu.tlj.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

import nyu.tlj.leetcode.common.Point;

public class MaxPointsonaLine {

	public static void main(String[] args) {

	}

	public int maxPoints(Point[] points) {
		if(points == null || points.length == 0 ){
			return 0;
		}
		int max = 1,dup = 0;
		Point p1,p2;
		double k = 0.0;
		Map<Double, Integer> map = new HashMap<Double, Integer>();
		
		for( int i = 0; i < points.length; i++ ){
			dup = 0;
			map.clear();
			map.put((double)Integer.MIN_VALUE, 1);
			p1 = points[i];
			for (int j = i+1;j < points.length; j++) {
				p2 = points[j];
				if( p1.x == p2.x && p1.y == p2.y ){
					dup++;
					continue;
				}
				k = p1.x == p2.x ? Integer.MAX_VALUE : ( (double) ( p1.y - p2.y ) / (double)( p1.x - p2.x ) + 0.0 );
				if( map.containsKey(k)) {
					map.put(k, map.get(k)+1);
				}else{
					map.put(k, 2);
				}
			}
			for( int tmp : map.values()){
				if( tmp + dup > max ){
					max = tmp + dup;
				}
			}
			
		}
		
		return max;
		
	}

}
