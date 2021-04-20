package com.epe.algorithm.yhlee.example.check2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 
 * 
 */

class Given{
	int number;
	int sum;
	
	Given(int number, int sum){
		this.number = number;
		this.sum = sum;
	}
}

public class Solution1 {

	
	public static void main(String[] args) {
		Solution1 aab = new Solution1();
		int[] a = {13,765,45};
		
		Queue<Given> list = new LinkedList<>(); 
		for(int i = 0; i<a.length; i++) {
			int sum = 0;
			int number = a[i];
			while(number!=0){
				sum += number%10;
		        number /= 10;
			}
			list.offer(new Given(a[i], sum));
		}
		
		int sum = 0;
		while(!list.isEmpty()) {
			Given poll = list.poll();
			for (Given peek : list) {
				if(poll.sum == peek.sum) {
					sum = Math.max(sum, poll.number + peek.number);
				}				
			}
			
		}
		System.out.println(sum);
		
	}
	
	public String solve(int[] a) {
		Map<Integer, Integer> aa = new HashMap<>(); 
		for(int i = 0; i<a.length; i++) {
			int sum = 0;
			int number = a[i];
			while(number!=0){
				sum += number%10;
		        number /= 10;
			}
			aa.put(a[i], sum);
		}
		
		
		
		
		
		return null;
	}
	
	public void print() {
	}
}
