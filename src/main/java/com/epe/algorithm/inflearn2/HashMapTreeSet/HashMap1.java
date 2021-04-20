package com.epe.algorithm.inflearn2.HashMapTreeSet;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 
 */

public class HashMap1 {

	
	public static void main(String[] args) {
		HashMap1 aab = new HashMap1();
		Map<String, Integer> aa = new HashMap<>();
		Map<String, Integer> bb = new HashMap<>();
		
		aa.put("a", 1);
		aa.put("b", 1);
		aa.put("c", 1);
		
		bb.put("c", 1);
		bb.put("b", 1);
		bb.put("a", 1);
		
		
		System.out.println(aa.equals(bb));
		
		
		aab.solve();
		
	}
	
	public String solve() {
		
		return null;
	}
	
	public void print() {
	}
}
