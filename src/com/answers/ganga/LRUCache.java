package com.answers.ganga;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/*You are required to complete below class */
class LRUCache {
 
    static Map<Integer,Integer> map;
	static Queue<Integer> queue;
	static int max;
	public LRUCache(int n) {
		map = new HashMap<Integer,Integer>();
		queue = new LinkedList<Integer>();
		max = n;
	}
	
	public void set(int x, int y) {
		if(!map.containsKey(x) && map.size()<max) {
			map.put(x, y);
			queue.add(x);
		} else if(!map.containsKey(x) && map.size()>=max) {
			int z = queue.remove();
			map.remove(z);
			map.put(x, y);
			queue.add(x);
		} else if(map.containsKey(x)) {
		    map.put(x,y);
		    queue.remove(x);
		    queue.add(x);
		}
	}
	public int get(int x) {
		if(map.containsKey(x)) {
		    queue.remove(x);
		    queue.add(x);
			return map.get(x);
		}
		return -1;
	}
}
