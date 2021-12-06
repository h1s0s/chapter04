package com.javaex.ex02;

public class CircleApp {

	public static void main(String[] args) {
		
	Circle c01 = new Circle(5);
	Circle c02 = new Circle(7);
	
	CircleList cList = new CircleList();
	
	cList.add(c01);
	cList.add(c02);
	
	System.out.println(cList.toString());
	System.out.println(cList.size());
	
	Circle c03 = new Circle(100);
	cList.add(c03);
	System.out.println(cList.toString());
	
	}
	
}
