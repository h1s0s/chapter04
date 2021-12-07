package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex03t {

	public static void main(String[] args) {
		// 로또만들기-강사님 코드
		Set<Integer> iSet = new HashSet<Integer>();
		while(true) {
			if(iSet.size() >=6) {
				break;
			} 
			int num = (int)(Math.random()*45)+1;
			iSet.add(num);
		}
		for(int no:iSet) {
			System.out.print(no+"\t");
		}
	}

}
