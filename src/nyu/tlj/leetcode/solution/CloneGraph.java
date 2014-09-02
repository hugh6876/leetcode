package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import nyu.tlj.leetcode.common.UndirectedGraphNode;

public class CloneGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Definition for undirected graph.
	 * class UndirectedGraphNode {
	 *     int label;
	 *     List<UndirectedGraphNode> neighbors;
	 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
	 * };
	 */
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		
		if(node == null){
			return null;
		}
		Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
		Queue<UndirectedGraphNode> nodes = new LinkedList<UndirectedGraphNode>();
		UndirectedGraphNode newRoot = new UndirectedGraphNode(node.label);
		List<UndirectedGraphNode> neighbors = new ArrayList<UndirectedGraphNode>();
		map.put(node, newRoot);
		nodes.add(node);
		UndirectedGraphNode tmp = new UndirectedGraphNode(0);
		while( !nodes.isEmpty() ){
			tmp = nodes.poll();
			neighbors = tmp.neighbors;
			for(UndirectedGraphNode nbor:neighbors){
				if( !map.containsKey(nbor) ) {
					map.put(nbor, new UndirectedGraphNode(nbor.label));
					nodes.add(nbor);
				}
			}
		}
		
		//copy neighbors
		for(UndirectedGraphNode key:map.keySet()){
			tmp = map.get(key);
			for(UndirectedGraphNode nb:key.neighbors){
				tmp.neighbors.add(map.get(nb));
			}
			//tmp.neighbors = new ArrayList<UndirectedGraphNode>(key.neighbors);
			
		}
		
		
		return map.get(node);

	}

}
