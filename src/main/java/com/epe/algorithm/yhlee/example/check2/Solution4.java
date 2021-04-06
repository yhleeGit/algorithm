package com.epe.algorithm.yhlee.example.check2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 
 * 
 */
class Dispenser{
	
	int lock = 0;
	String name;
	int liter;
	Dispenser(String name, int liter){
		this.name = name;
		this.liter = liter;
	}
}

public class Solution4 {

	public static void main(String[] args) {
		Solution4 aab = new Solution4();
//		int[] A = {2,8,4,3,2};
		int[] A = {5};
		int X = 4;
		int Y = 0;
		int Z = 3;
		
		Queue<Integer> list = new LinkedList<>(); 
		for (int a : A) {
			list.offer(a);
		}
		
		List<Dispenser> dipenserList = new ArrayList<>();
		dipenserList.add(new Dispenser("X", X));
		dipenserList.add(new Dispenser("Y", Y));
		dipenserList.add(new Dispenser("Z", Z));
		
		int time = 0;
		
		while(true) {
			
			time++;
			if(list.isEmpty()) break;
			
			Integer peek = list.peek();
			
			if(!vaildCheck(peek, dipenserList)) {
				time = -1;
				break;
			};
			
			boolean aaaa = aaaa(peek, time, dipenserList);
			if(aaaa) {
				
				list.poll();
				if(list.isEmpty()) break;
				
				peek = list.peek();
				if(!vaildCheck(peek, dipenserList)) {
					time = -1;
					break;
				};
				aaaa = aaaa(peek, time, dipenserList);
				
				if(aaaa) {
					list.poll();
					if(list.isEmpty()) break;
					peek = list.peek();
					if(!vaildCheck(peek, dipenserList)) {
						time = -1;
						break;
					};
					aaaa(peek, time, dipenserList);
				}
				
			}
			//차량 배분
			//가능한지 락은 없는지
				//배분 시 락 설정
				//가능한데 락이면 대기
			//
		}
		if(time > 0) time--;
		System.out.println(time);
		
		
	}
	public static boolean vaildCheck(int peek, List<Dispenser> dipenserList) {
		boolean check = false;
		for (Dispenser dispenser : dipenserList) {
			if(dispenser.liter >= peek) {
				check = true;
			};
		}
		return check;
	}
	
	public static boolean aaaa(int peek , int time, List<Dispenser> dipenserList) {
		for (Dispenser dispenser : dipenserList) {
			
			if(dispenser.liter >= peek && dispenser.lock < time) { //주유가 가능한 경우
				Integer poll = peek;
				dispenser.lock = dispenser.lock + poll;
				dispenser.liter = dispenser.liter - poll;
				return true;
			}
		}
		return false;
	}
	
	
}
