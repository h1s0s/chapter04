package com.javaex.ex02;

import java.util.Arrays;

public class CircleList {

	private Circle[] cArray;
	private int crtPos;

	public CircleList() {
		this.cArray = new Circle[3];
		this.crtPos = 0;
	}

	public void add(Circle c) {
		cArray[crtPos] = c;
		crtPos++;
	}

	public Circle get(int index) {
		return cArray[index];
	}

	public int size() {
		return crtPos;
	}

	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}
	
	
}
