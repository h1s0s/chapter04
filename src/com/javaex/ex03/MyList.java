package com.javaex.ex03;

import java.util.Arrays;

public class MyList<T> {

	private T[] oArray;
	private int crtPos;
	
	public MyList() {
		this.oArray = (T[])new Object[3];
		this.crtPos = 0;
	}
	
	public void add(T o) {
		oArray[crtPos] = o;
		crtPos++;
	}
	public T get(int index) {
		return oArray[index];
	}
	public int size() {
		return crtPos;
	}

	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}
	
}
