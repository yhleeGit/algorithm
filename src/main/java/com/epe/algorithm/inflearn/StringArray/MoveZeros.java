package com.epe.algorithm.inflearn.StringArray;

/**
 * [0,3,2,0,8,5] 이라는 배열을 전달 받을때 0은 제일 뒤로 정렬 나머지는 순서 변경없이 앞으로 이동
 */

public class MoveZeros {

	public static void main(String[] args) {
		
		MoveZeros mz = new MoveZeros();
		int[] arr = new int[] {0,3,2,0,8,5};
		
		mz.print(mz.solve(arr));
	}
	
	public int[] solve(int[] arr) {
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}
		
		while(index < arr.length) {
			arr[index++] = 0;
		}
		
		return arr;
	}
	
	public void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
