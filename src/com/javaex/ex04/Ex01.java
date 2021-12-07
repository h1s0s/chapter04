package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		// 1. ArrayList
		
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(7,7);
	
		//Arraylist 생성(섞어쓰기)
		//인터페이스인 List형태의 pList를 생성
		//ArrayList의 자료형의 메소드들이 오버라이드 됨(겹치는 메소만)
		//1. 섞어쓰기를 하면, ArrayList<->LinkedList간의 변경에 문제가 없음
		//이유: List에 있는 메소드만 사용했기 때문에
		
		List<Point>pList = new ArrayList<Point>();
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList.size());
		
		//pList 배열 안에있는 point에 접근하기
		System.out.println(pList.get(1).getX());
		
		//for문을 이용해 pList의 정보를 순서대로 출력.
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("=============================");
		//데이터 지우기
		//중간의 인덱스가 지워지면 뒤에있는 방들이 땡겨짐
		
		pList.remove(1);
		System.out.println(pList.size());
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		//원하는 인덱스의 위치에 배열 넣기
		System.out.println("==========================");
		pList.add(1, p02);
		System.out.println(pList.size());
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
	
		System.out.println("==========================");
		System.out.println(pList.toString());
		
		//새로운 반복, 향상된 for문(반복회수를 조정할 수 없는, 끝까지 돌려라)
		System.out.println("==========================");
		for(Point p : pList) {//pList를 배열의 처음부터 끝까지 반복
			//배열의 자료형에 해당하는 변수: 반복할 배열
			System.out.println(p.getX());
		}
		
	}

}
