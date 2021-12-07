package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {
		// 2.2 Set 심화
		//객체의 경우 필드값이 같아도 중복되지 않는 부분에 대해
		//set타입은 add를 할때 올라와있는 것들과 hashcode 중복체크->equal체크 를 하여 같으면 중복이라고 본다.
		
		
		Point p01 = new Point(3,13);
		Point p02 = new Point(4,14);
		Point p03 = new Point(3,13);

		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println(p03.hashCode());
		
		Set<Point> pSet = new HashSet<Point>();
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		System.out.println(pSet.toString());
	}

}
