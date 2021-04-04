package com.epe.algorithm.inflearn.QueueStack;

import java.util.Stack;

/**
 * [5,-2,4,C,D,9,+,+] 이런형태의 input을 받는다
 * 숫자는 sum 하고, C 는 직전 데이터 삭제, D는 직전 데이터의 *2 값을 sum, +는 직전 데이터와 그 이전 데이터의 합을 sum 처리 한다.
 * 즉 순서대로 5 + (-2) + 4 -> 4삭제 -> + (-2*2) -> +9 -> + ((-2*2) + 9) -> +(9 + ((-2*2) + 9))
 * 이 순서대로 처리한다.
 */

public class BaseballGame {

	public static void main(String[] args) {
		BaseballGame aab = new BaseballGame();
		
		String[] strs = {"5","-2","4","C","D","9","+","+"};
		int solve = aab.solve(strs);
		System.out.println(solve);
		
	}
	
	public int solve(String[] strs) {
		
		Stack<Integer> stack = new Stack<>();
		for (String str : strs) {
			switch (str) {
				case "C":
					stack.pop();
					break;
				case "D":
					stack.push(stack.peek()*2);
					break;
				case "+":
					Integer pop = stack.pop();
					Integer peek = stack.peek();
					stack.push(pop);
					stack.push(pop+peek);
					break;
				default:
					stack.push(Integer.valueOf(str));
					break;
			}
		}
		int result = 0;
		while(!stack.isEmpty()) {
			result += stack.pop();
		}
		return result;
	}
	
}
