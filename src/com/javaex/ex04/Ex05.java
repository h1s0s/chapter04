package com.javaex.ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {

	public static void main(String[] args) {
		// 3. Map - HashMap
		
		Map<String,Point> pMap = new HashMap<String,Point>();//매개변수<키의 자료형, 값의 자료형>
		
		Point p01 = new Point(1, 11); //권상우의 포인트
		Point p02 = new Point(2, 22); //정우성의 포인트
		Point p03 = new Point(3, 33); //이효리의 포인트
		
		//Map에 값을 넣는다. put의 기능
		//1. Key만 안겹치면 값은 중복되게 넣을 수 있음.
		//2. Key값이 겹치면 수정의 개념. 값을 새로 바꿈.
		//3. 들어간 순서는 중요하지 않은것으로 보아 순서의 개념이 없는듯함.
		pMap.put("권상우", p01);
		pMap.put("정우성", p02);
		pMap.put("이효리", p03);
		//Key값은 Set의 기능을 이용함.
		
		
		//Map에 X값을 출력
		System.out.println("정우성 x값:"+pMap.get("정우성").getX());
		
		//Map의 사이즈를 출력
		System.out.println("pMap size:"+pMap.size());
		
		//Map의 toString 출력
		System.out.println("toString:");
		System.out.println(pMap.toString());
		
		//Map의 KeySet 출력, KeySet을 이용한 향상된 반복문
		Set<String> keySet = pMap.keySet();
		//Keyset들은 Set의 자료형임.
		System.out.println("keySet:"+keySet);
		
		for(String key:keySet) {
			System.out.println(pMap.get(key).getX());
		}
		
		//////////////////////////////////////////////////////////////////////////////////////
		
	}
}
