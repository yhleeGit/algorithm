package com.epe.algorithm.yhlee.example.check1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 
 * 
 */

public class Solution3 {

	
	public static void main(String[] args) {
		Solution3 aab = new Solution3();
		int n = 6;
		
		int[][] quests = {{1,3}, {1,4}, {3,5}, {5,4}};
		
		Arrays.sort(quests, (a,b) -> a[0] - b[0]);
		
		List<Integer> aa = aab.solve(quests, n);
		
		int[] array = new int[aa.size()];
		for(int i =0; i< aa.size(); i++) {
			array[i] = aa.get(i);
		}
		
		for (int i : array) {
			System.out.println(i);
		}
		
		
	}
	
	public List<Integer> solve(int[][] quests, int n) {
		
		List<Integer> result = new ArrayList<>();
		
		List<int[]> questList = new ArrayList<>();
		for (int[] is : quests) {
			questList.add(is);
		}
		
		Stack<Integer> stack = new Stack<>(); 
		
		Queue<Integer> queue = new LinkedList<>();  
		
		for(int i = 1; i<=n; i++) {
			stack.push(i);
//			queue.offer(i);
			
			boolean check = true;
			
			for (int[] quest : questList) {
				if(quest[1] == stack.peek()) {
					check = false;
				}
//				if(quest[1] == queue.peek()) {
//					check = false;
//				}
			}
			
			if(check) {
				Integer pop = stack.pop();
//				Integer pop = queue.poll();
				
				Iterator<int[]> it = questList.iterator();
				while(it.hasNext()) {
					int[] quest = it.next();
					if(quest[0] == pop) {
						it.remove();
					}
				}
				result.add(pop);
				
			}
		}
		
		if(questList.isEmpty()) {
			Stack<Integer> stack2 = new Stack<>(); 
			while(!stack.isEmpty()) {
				
				stack2.push(stack.pop());
				result.add(stack2.pop());
			}
//			while(!queue.isEmpty()) {
//				result.add(queue.poll());
//			}
		}
		
		return result;
	}
	
	
	public void print() {
	}
}
