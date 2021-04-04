package com.epe.algorithm.inflearn.StringArray;

/**
 * "8f3Z3-2e-9-wabasdASD" 특문 "-"이 들어간 불규칙 텍스트를 받는다
 * 이때 특문 "-"은 지우고 문자는 대문자로 치환 이후 끝에서 부터 n글자씩 잘라 "-"을 추가 한뒤 리턴해라
 * n은 주어진다.
 */

public class LicenseKeyFormatting {

	
	public static void main(String[] args) {
		LicenseKeyFormatting lkf = new LicenseKeyFormatting();
		int n = 3;
		String str = "8f3Z3-2e-9-wabasdASD---";
		String solve = lkf.solve(str, n);
		System.out.println(solve);
	}
	
	public String solve(String str, int n) {
		
		StringBuilder sb = new StringBuilder();
		String[] split = str.split("");
		for (String string : split) {
			if(string.equals("-"))continue;
			sb.append(string.toUpperCase());
		}
		
		String changeTxt = sb.toString();
		for(int i=n; i<changeTxt.length(); i+=n) {
			sb.insert(changeTxt.length()-i, "-");
		}
		return sb.toString();
	}
	
}
