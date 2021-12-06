package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		
		//도형 생성
		Point p01 = new Point(4,7);
		Point p02 = new Point(8,17);
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(19);
		
		//포인트 리스트 생성
		MyList<Point> pList = new MyList<Point>();
		pList.add(p01);
		pList.add(p02);
		System.out.println(pList.toString());
		System.out.println(pList.get(0).toString());
		//Object의 toStrin 오버라이딩 됨.
		
		//원 리스트 생성
		MyList<Circle> cList = new MyList<Circle>();
		cList.add(c01);
		cList.add(c02);
		
		System.out.println(cList.get(0).getRadish());
		
		System.out.println(cList.toString());
	}
}