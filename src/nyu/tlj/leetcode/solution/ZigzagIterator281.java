package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class ZigzagIterator{}

public class ZigzagIterator281 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Deque<Iterator<Integer>> list = new LinkedList<Iterator<Integer>>();
	
	public ZigzagIterator281(List<Integer> v1, List<Integer> v2) {
		if(!v1.isEmpty()){
			list.addLast(v1.iterator());
		}
		if( !v2.isEmpty() ){
			list.addLast(v2.iterator());
		}
    }

    public int next() {
    	if(!hasNext()) return Integer.MIN_VALUE;//throw ex
    	
    	Iterator<Integer> iterator = list.removeFirst();
    	
    	int ret = iterator.next();
    	if(iterator.hasNext()){
    		list.addLast(iterator);
    	}
    	return ret;
    }

    public boolean hasNext() {
        return !list.isEmpty();
    }
    
    
	/** 1 ****
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
        return i.hasNext() || j.hasNext();
    }
*/
}
