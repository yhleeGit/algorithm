package com.epe.algorithm.inflearn.StringArray;

import java.util.HashSet;
import java.util.Set;

/**
 * jewels 값을 받고 해당 값에 대한 문자열이 stones에 몇개가 있는지 확인한다.
 * 대소문자는 각각 다른 문자열이다. jewels값에 중복은 허용 하지 않는다.
 */

public class JewelsAndStones {

	
	public static void main(String[] args) {
		JewelsAndStones jas = new JewelsAndStones();
		String jewels = "aA";
		String stones= "aAAbbbb";
		System.out.println(jas.solve(jewels, stones));
		
	}
	
	public int solve(String jw, String st) {
		int cnt = 0;
		
		String[] jewels = jw.split("");
		Set<String> jwSet = new HashSet<>();
		for (String jewel : jewels) {
			jwSet.add(jewel);
		}
		
		String[] stones = st.split("");
		for (String stone : stones) {
			if(jwSet.contains(stone))
				cnt++;
		}
		
		return cnt;
	}
	
	public void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
