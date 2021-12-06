package com.javaex.ex03;

public class Circle {

	private int radish;
	
	public Circle() {
		
	}
	public Circle(int radish) {
		this.radish = radish;
	}
	
	
	public int getRadish() {
		return radish;
	}
	public void setRadish(int radish) {
		this.radish = radish;
	}
	
	@Override
	public String toString() {
		return "Circle [radish=" + radish + "]";
	}
	
}
