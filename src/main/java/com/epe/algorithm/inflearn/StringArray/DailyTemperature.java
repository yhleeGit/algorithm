package com.epe.algorithm.inflearn.StringArray;

import java.util.Stack;

/**
 * [73,74,75,71,69,72,76,73] 이라는 화씨온도가 주어지고,
 * 각 당일 온도 기준으로 언제 온도가 올라가는지에 대한 계산을 한다.
 * 73도는 바로 다음날 74도로 올라가기 때문에 1, 75도는 4일 뒤에 76도이기때문에 4, 76도는 미래에 오른 온도가 없기때문에 0이다.
 * 결과는 [1,1,4,2,1,1,0,0] 이다
 * 
 */

public class DailyTemperature {

	
	public static void main(String[] args) {
		
		DailyTemperature dt = new DailyTemperature();
		int[] temper = {73,74,75,71,69,72,76,73};
		int[] res = dt.solve(temper);
		dt.print(res);
	}
	
	public int[] solve(int[] temper) {

		Stack<Integer> stack = new Stack<>();
		int[] result = new int[temper.length];
		
		for(int i=0; i<temper.length; i++) {
			System.out.println("temper "+temper[i]);
			//현제 값이 이전 Stack에 쌓인 값보다 큰지 확인을 한다.
			while(!stack.isEmpty() && temper[stack.peek()] < temper[i]) {
				int index = stack.pop(); //peek + remove
				System.out.println("i "+i+" index "+index);
				result[index] = i-index;
			}
			stack.push(i);
		}
		
		return result;
	}
	
	public void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
