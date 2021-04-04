package com.epe.algorithm.inflearn.QueueStack;

import java.util.Stack;

/**
 * "(())", "({]", "[{()}]" 인 형태의 괄호 데이터가 들어온다. 괄호 가 정상적으로 열리고 닫혔는지 확인해라
 */

public class VaildParentheses {
	
	public static void main(String[] args) {
		VaildParentheses aab = new VaildParentheses();
//		String exp = "(){}[]";
//		String exp = "((){})";
		String exp = "[()}";
		
		boolean solve = aab.solve(exp);
		System.out.println(solve);
		
	}
	
	public boolean solve(String exp) {
		String[] split = exp.split("");
		Stack<String> stack = new Stack<>();
		
		for (String str : split) {
			switch (str) {
			case ")":
				if(!stack.isEmpty() && stack.peek().equals("(")) stack.pop();
				break;
			case "}":
				if(!stack.isEmpty() && stack.peek().equals("{")) stack.pop();
				break;
			case "]":
				if(!stack.isEmpty() && stack.peek().equals("[")) stack.pop();
				break;

			default:
				stack.push(str);
				break;
			}
			
		}
		
		return stack.isEmpty();
	}
	
}
