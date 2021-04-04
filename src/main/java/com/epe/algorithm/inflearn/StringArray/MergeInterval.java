package com.epe.algorithm.inflearn.StringArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Interval 클래스를 전달 받는다
 * ex -> [1,3], [2,6], [8,10], [15,18]
 * [1,3], [2,6] 은 서로 겹쳐지는 부분이 있다 이럴때 겹쳐지는 부분은 서로 합쳐 [1,6]으로 노출이 되어야 한다.
 */
class Interval{
	int start;
	int end;
	
	Interval(int s, int e){
		this.start = s;
		this.end = e;
	}
}

public class MergeInterval {

	public static void main(String[] args) {
		MergeInterval a = new MergeInterval();
		
		Interval i1 = new Interval(2, 6);
		Interval i2 = new Interval(1, 3);
		Interval i3 = new Interval(8, 10);
		Interval i4 = new Interval(9, 18);
		Interval i5 = new Interval(15, 16);
		Interval i6 = new Interval(19, 20);
		
		Interval[] intervals = new Interval[]{i1, i2, i3, i4, i5, i6};
		a.print(a.solve(intervals));
	}
	
	public List<Interval> solve(Interval[] intervals) {
		
		Arrays.sort(intervals, (a,b)-> a.start - b.start);
		List<Interval> result = new ArrayList<>();
		
		Interval before = intervals[0];
		for(int i=1; i<intervals.length; i++) {
			
			Interval current = intervals[i];
			if(before.end >= current.start) {
				before = new Interval(before.start, Math.max(before.end, current.end));
				if(i==intervals.length-1) {
					result.add(before);
				}
				continue;
			} 
			result.add(before);
			before=current;
			if(i==intervals.length-1) {
				result.add(before);
			}
		}
		
		return result;
	}

	
			
	public void print(List<Interval> intervals) {
		for (Interval interval : intervals) {
			System.out.println(interval.start+"_"+interval.end);
		}
		System.out.println();
	}
}
