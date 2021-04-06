package com.epe.algorithm.yhlee.example.check2;

/**
 * 
 * 
 */

class Node{
	boolean light = false;
	boolean on = false;
}

public class Solution3 {

	
	public static void main(String[] args) {
		Solution3 aab = new Solution3();
		int[] a = {1,3,4,2,5};
		
		
		Node[] switchs = new Node[a.length];
		for(int i =0; i<a.length; i++) {
			switchs[i] = new Node();
		}

		int lightCheck = 0;
		for(int i= 0; i<a.length; i++) {
			int indexCheck = a[i];
			boolean lightOn = switchOn(switchs, indexCheck-1);
			
			if(lightOn) lightCheck++;
		}
		
		System.out.println(lightCheck);
		
	}
	
	public static boolean switchOn(Node[] aa, int index) {
		boolean onCheck = false;
		aa[index].on = true;
		
		if(index == 0) {
			aa[index].light = true;
			onCheck = true;
			lightOn(aa, index+1);
		}else {
			Node node = aa[index-1];
			if(node.light) {
				aa[index].light = true;
				onCheck = true;
				lightOn(aa, index+1);
			}
		}
		
		
		return onCheck;
	}
	
	public static void lightOn(Node[] aa, int index) {
		if(index >= aa.length) return;
		
		if(aa[index].on) {
			aa[index].light = true;
			lightOn(aa, index+1);
		}else {
			return;
		}
	}
	
	
	public void print() {
	}
}
