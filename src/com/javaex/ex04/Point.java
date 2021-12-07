package com.javaex.ex04;

import java.util.Objects;

public class Point {

	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//메소드g/s
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}

	//메소드일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public int hashCode() {
		return x+y;
	}
	@Override
	public boolean equals(Object obj) {
		Point p = ((Point)obj);
		if(this.x== p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	
}
