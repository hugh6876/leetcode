package nyu.tlj.leetcode.solution;

import java.util.Iterator;
import java.util.List;

class ZigzagIterator{}

public class ZigzagIterator281 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Iterator<Integer> i, j, temp;
	
	
	public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
		i = v1.iterator();
		j = v2.iterator();
    }

    public int next() {
    	if(!hasNext()) return Integer.MIN_VALUE;//throw ex
    	
    	if(i.hasNext()){
    		int ret = i.next();
    		temp = i;
    		i = j;
    		j = temp;
    		return ret;
    	}else {
			return j.next();
		}
    }

    public boolean hasNext() {
        return i.hasNext() | j.hasNext();
    }

}
