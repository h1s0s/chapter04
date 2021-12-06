package com.javaex.ex01;

import java.util.Arrays;

public class PointList {

	//필드
	private Point[] pArray;
	private int crtPos; // 포인트가 들어갈 인덱스넘버
	
	//생성자
	public PointList() {
		//배열을 만들어 준다
		this.pArray = new Point[3];
		this.crtPos = 0;
	}
	
	//메소드 g-s
	//필드에 접근해서 get, set을 해버리면 문제가 생기기 때문에
	//의도적으로 만들지 않음
	
	//메소드 일반
	public void add(Point p) {
		//흔히 생각하는 오류중에 add를 해서 객체를 배열에 넣게되면
		//객체 자체를 가지고 오는게 아닌 객체의 주소값을 가지고 오는것임
		pArray[crtPos] = p;
		crtPos++;
	}
	public Point get(int index) {
		//입력한 index 방의 주소값을 리턴해준다
		Point result = pArray[index];
		return result;
	}
	public int size() {
		//현재 관리되고 있는 crtPos를 리턴
		return crtPos;
	}

	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}
	
}
